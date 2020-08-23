/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnected;

import Pojo.Equipment;
import Pojo.Messages;
import Pojo.Notifications;
import Pojo.TheRoute;
import Pojo.Users;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TT
 */
public class DBConnection {

    Connection bridge = null;
    PreparedStatement car = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void connected() {
        try {
            DriverManager.registerDriver(new Driver());
            bridge = DriverManager.getConnection(DBProperty.url, DBProperty.username, DBProperty.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void myClose() {
        try {
            bridge.close();
            car.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Start Users
    public void insertUsers(Users u) {
        try {
            connected();
            car = bridge.prepareStatement("insert users(name,surname,father_name,gender,email,username,password,phone,date_of_birth,image,description,languages,register,status,role)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            car.setString(1, u.getName());
            car.setString(2, u.getSurname());
            car.setString(3, u.getFather_name());
            car.setString(4, "" + u.getGender());
            car.setString(5, u.getEmail());
            car.setString(6, u.getUsername());
            car.setString(7, u.getPassword());
            car.setString(8, u.getPhone());
            car.setString(9, u.getDate_of_birth());
            car.setBytes(10, u.getImage());
            car.setString(11, u.getDescription());
            car.setString(12, u.getLanguages());
            car.setString(13, sdf.format(new Date()));
            car.setInt(14, 1);
            car.setInt(15, 1);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }

    }

    public List<Users> listUsers() {
        try {
            connected();
            List<Users> l = new ArrayList<Users>();
            car = bridge.prepareStatement("select * from users where id!=11 ");
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                l.add(new Users(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),
                        rs.getString("father_name"), rs.getString("gender").charAt(0),
                        rs.getString("email"), rs.getString("username"), rs.getString("password"),
                        rs.getString("phone"), rs.getString("date_of_birth"),
                        rs.getBytes("image"), rs.getString("description"),
                        rs.getString("languages"), rs.getString("register"), rs.getInt("status"), rs.getInt("role")));

            }
            return l;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public Users findByid(int id) {
        try {
            connected();
            Users u = new Users();
            car = bridge.prepareStatement("select * from users where id=?");
            car.setInt(1, id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setSurname(rs.getString("surname"));
                u.setFather_name(rs.getString("father_name"));
                u.setGender(rs.getString("gender").charAt(0));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setPhone(rs.getString("phone"));
                u.setDate_of_birth(rs.getString("date_of_birth"));
                u.setImage(rs.getBytes("image"));
                u.setDescription(rs.getString("description"));
                u.setLanguages(rs.getString("languages"));
                u.setRegister(rs.getString("register"));
                u.setStatus(rs.getInt("status"));
                u.setRole(rs.getInt("role"));
            }
            return u;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public Users loginUsers(String username, String password) {
        try {
            connected();
            Users u = new Users();
            u = null;
            car = bridge.prepareStatement("select * from users where username=? and password=?");
            car.setString(1, username);
            car.setString(2, password);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                u = new Users(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),
                        rs.getString("father_name"), rs.getString("gender").charAt(0),
                        rs.getString("email"), rs.getString("username"), rs.getString("password"),
                        rs.getString("phone"), rs.getString("date_of_birth"),
                        rs.getBytes("image"), rs.getString("description"),
                        rs.getString("languages"), rs.getString("register"), rs.getInt("status"), rs.getInt("role"));
            }
            if (u != null) {
                if (u.getStatus() == 0) {
                    car = bridge.prepareStatement("update users set status=1 where id=" + u.getId());
                    car.executeUpdate();

                    car = bridge.prepareStatement("update equipment set status=1 where user_id=" + u.getId());
                    car.executeUpdate();
                }
            }
            return u;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public void blockUsers(int id) {
        try {
            connected();
            car = bridge.prepareStatement("update equipment set status=2 where user_id=" + id);
            car.executeUpdate();

            car = bridge.prepareStatement("delete from the_route where user_id=" + id);
            car.executeUpdate();

            car = bridge.prepareStatement("update users set status=2 where id=" + id);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void unblockUsers(int id) {
        try {
            connected();
            car = bridge.prepareStatement("update equipment set status=1 where user_id=" + id);
            car.executeUpdate();

            car = bridge.prepareStatement("update users set status=1 where id=" + id);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void updateUsers(Users u) {
        try {
            connected();
            car = bridge.prepareStatement("update users set name=?, surname=?, father_name=?, gender=?, "
                    + "email=?, username=?, phone=?, date_of_birth=?, "
                    + "image=?, description=?, languages=? where id=?");
            car.setString(1, u.getName());
            car.setString(2, u.getSurname());
            car.setString(3, u.getFather_name());
            car.setString(4, "" + u.getGender());
            car.setString(5, u.getEmail());
            car.setString(6, u.getUsername());
            car.setString(7, u.getPhone());
            car.setString(8, u.getDate_of_birth());
            car.setBytes(9, u.getImage());
            car.setString(10, u.getDescription());
            car.setString(11, u.getLanguages());
            car.setInt(12, u.getId());
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public int findByUsername(String username) {
        try {
            connected();
            int count = 0;
            car = bridge.prepareStatement("select count(*) from users where username=?");
            car.setString(1, username);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }

            return count;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            myClose();
        }
    }

    public int findByUsernameId(String username) {
        try {
            connected();
            int i = 0;
            car = bridge.prepareStatement("select * from users where username=?");
            car.setString(1, username);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                i = rs.getInt("id");
            }

            return i;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            myClose();
        }
    }

    public Users findByUsernameIdForReturnFromRegister(String username) {
        try {
            connected();
            Users u = null;
            car = bridge.prepareStatement("select * from users where username=?");
            car.setString(1, username);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                u = new Users(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),
                        rs.getString("father_name"), rs.getString("gender").charAt(0),
                        rs.getString("email"), rs.getString("username"), rs.getString("password"),
                        rs.getString("phone"), rs.getString("date_of_birth"),
                        rs.getBytes("image"), rs.getString("description"),
                        rs.getString("languages"), rs.getString("register"), rs.getInt("status"), rs.getInt("role"));
            }

            return u;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public void changePassword(Users u) {
        try {
            connected();
            car = bridge.prepareStatement("update users set password=? where id=?");
            car.setString(1, u.getPassword());
            car.setInt(2, u.getId());
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void freezeAccount(Users u) {
        try {
            connected();
            car = bridge.prepareStatement("update equipment set status=0 where user_id=" + u.getId());
            car.executeUpdate();

            car = bridge.prepareStatement("delete from notifications where user_id_to=" + u.getId());
            car.executeUpdate();

            car = bridge.prepareStatement("delete from notifications where user_id_from=" + u.getId());
            car.executeUpdate();

            car = bridge.prepareStatement("delete from the_route where user_id=" + u.getId());
            car.executeUpdate();

            car = bridge.prepareStatement("update users set status=0 where id=" + u.getId());
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    // End Users
    // Start Equipment
    public void insertEquipment(Equipment e) {
        try {
            connected();
            car = bridge.prepareStatement("insert equipment(user_id,brand,model,ban_type,conditioner,status)values(?,?,?,?,?,?)");
            car.setInt(1, e.getUser_id());
            car.setString(2, e.getBrand());
            car.setString(3, e.getModel());
            car.setString(4, e.getBan_type());
            car.setString(5, "" + e.getConditioner());
            car.setInt(6, 1);
            car.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            myClose();
        }

    }

    public List<Equipment> findByEquipForRoute(int id) {
        try {
            connected();
            List<Equipment> list = new ArrayList<Equipment>();
            car = bridge.prepareStatement("select * from equipment where status=1 and user_id=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Equipment(rs.getInt("id"), rs.getInt("user_id"), rs.getString("brand"), rs.getString("model"),
                        rs.getString("ban_type"), rs.getString("conditioner").charAt(0), rs.getInt("status")));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public Equipment findByEquipForEqId(int id) {
        try {
            connected();
            Equipment e = new Equipment();
            car = bridge.prepareStatement("select * from equipment where status=1 and id=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                e = new Equipment(rs.getInt("id"), rs.getInt("user_id"), rs.getString("brand"), rs.getString("model"),
                        rs.getString("ban_type"), rs.getString("conditioner").charAt(0), rs.getInt("status"));
            }
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public Equipment findByEquipUserId(int id) {
        try {
            connected();
            Equipment e = null;
            car = bridge.prepareStatement("select * from equipment where id=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                e = new Equipment(rs.getInt("id"), rs.getInt("user_id"), rs.getString("brand"), rs.getString("model"),
                        rs.getString("ban_type"), rs.getString("conditioner").charAt(0), rs.getInt("status"));
            }
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public int searchEquipId(Users u) {
        try {
            connected();
            int i = 0;
            car = bridge.prepareStatement("select id from equipment where status=1 and user_id=" + u.getId());
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                i = rs.getInt("id");
            }
            return i;
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        } finally {
            myClose();
        }

    }

    public List<Equipment> listEquipmentForEquipTable(int id) {
        try {
            connected();
            List<Equipment> list = new ArrayList<Equipment>();
            car = bridge.prepareStatement("select * from equipment where user_id=" + id + " and status=1 or status=0");
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Equipment(rs.getInt("id"), rs.getInt("user_id"), rs.getString("brand"), rs.getString("model"),
                        rs.getString("ban_type"), rs.getString("conditioner").charAt(0), rs.getInt("status")));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public void blockEquipment(int id) {
        try {
            connected();
            car = bridge.prepareStatement("update equipment set status=0 where id=" + id);
            car.executeUpdate();

            car = bridge.prepareStatement("delete from the_route where eq_id=" + id);
            car.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void unBlockEquipment(int id) {
        try {
            connected();
            car = bridge.prepareStatement("update equipment set status=1 where id=" + id);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    //End Equipment
    //Start The_Route
    public void insertTheRoute(TheRoute r) {
        try {
            connected();
            car = bridge.prepareStatement("insert the_route(user_id, eq_id, loc_from, loc_to, dates, categories, passenger, luggage, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            car.setInt(1, r.getUser_id());
            car.setInt(2, r.getEq_id());
            car.setString(3, r.getLoc_from());
            car.setString(4, r.getLoc_to());
            car.setString(5, r.getDates());
            car.setString(6, "" + r.getCategories());
            car.setInt(7, r.getPassenger());
            car.setDouble(8, r.getLuggage());
            car.setInt(9, r.getStatus());
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public List<Equipment> listEquipmentForOtherRoute() {
        try {
            connected();
            List<Equipment> list = new ArrayList<Equipment>();
            car = bridge.prepareStatement("select * from equipment where user_id=" + 11);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Equipment(rs.getInt("id"), rs.getInt("user_id"), rs.getString("brand"), rs.getString("model"),
                        rs.getString("ban_type"), rs.getString("conditioner").charAt(0), rs.getInt("status")));
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public List<TheRoute> listForRouteForIWantToGoTable(int id) {
        try {
            connected();
            List<TheRoute> list = new ArrayList<TheRoute>();
            car = bridge.prepareStatement("select * from the_route where dates >= CURDATE() and status=1 and passenger !=0 and user_id !=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getDouble("luggage"), rs.getInt("status")));
            }

            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public List<Integer> listTheRouteForOldDates() {
        try {
            connected();
            List<Integer> list = new ArrayList<Integer>();
            car = bridge.prepareStatement("select id from the_route where status=0");
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt("id"));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public void deleteTheRouteForDates() {
        try {
            connected();
            car = bridge.prepareStatement("update the_route set status=0 where dates < CURDATE()");
            car.executeUpdate();

            for (Integer idler : listTheRouteForOldDates()) {
                connected();
                car = bridge.prepareStatement("update notifications set status=3 where route_id=" + idler);
                car.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public List<TheRoute> listForRouteForIWantToSendTable(int id) {
        try {
            connected();
            List<TheRoute> list = new ArrayList<TheRoute>();
            car = bridge.prepareStatement("select * from the_route where dates >= CURDATE() and status=1 and luggage !=0 and user_id !=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getDouble("luggage"), rs.getInt("status")));
            }

            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public List<TheRoute> listForRouteForMyActiveRoutes(int id) {
        try {
            connected();
            List<TheRoute> list = new ArrayList<TheRoute>();
            car = bridge.prepareStatement("select * from the_route where user_id=" + id + " and status=1");
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getDouble("luggage"), rs.getInt("status")));
            }

            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public TheRoute findByTheRouteId(int Rid) {
        try {
            connected();
            TheRoute r = new TheRoute();
            car = bridge.prepareStatement("select * from the_route where id=" + Rid);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                r = new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getDouble("luggage"), rs.getInt("status"));
            }

            return r;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public void deleteTheRoute(int id) {
        try {
            connected();
            // Biz sildiyimiz Route -un Notifications -larinida 2 ve ya 3 elemeliyik !
            car = bridge.prepareStatement("update the_route set status=0 where id=" + id);
            car.executeUpdate();

            car = bridge.prepareStatement("update notifications set status=3 where route_id=" + id);
            car.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void updateTheRoute(TheRoute r) {
        try {
            connected();
            car = bridge.prepareStatement("update the_route set eq_id=?, loc_from=?, "
                    + "loc_to=?, dates=?, categories=?, passenger=?, "
                    + "luggage=? where id=?");
            car.setInt(1, r.getEq_id());
            car.setString(2, r.getLoc_from());
            car.setString(3, r.getLoc_to());
            car.setString(4, r.getDates());
            car.setString(5, "" + r.getCategories());
            car.setInt(6, r.getPassenger());
            car.setDouble(7, r.getLuggage());
            car.setInt(8, r.getId());
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public List<TheRoute> findByLocFromAndLocTo(String LocFrom, String LocTo, int id) {
        try {
            connected();
            List<TheRoute> l = new ArrayList<TheRoute>();
            car = bridge.prepareStatement("select * from the_route where user_id !=" + id + " and loc_from like ? and loc_to like ?");
            car.setString(1, LocFrom);
            car.setString(2, LocTo);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                l.add(new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getInt("luggage"), rs.getInt("status")));
            }
            return l;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public List<TheRoute> findByLocFrom(String LocFrom, int id) {
        try {
            connected();
            List<TheRoute> l = new ArrayList<TheRoute>();
            car = bridge.prepareStatement("select * from the_route where user_id !=" + id + " and loc_from like ?");
            car.setString(1, LocFrom);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                l.add(new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getInt("luggage"), rs.getInt("status")));
            }
            return l;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public List<TheRoute> findByLocTo(String LocTo, int id) {
        try {
            connected();
            List<TheRoute> l = new ArrayList<TheRoute>();
            car = bridge.prepareStatement("select * from the_route where user_id !=" + id + " and loc_to like ?");
            car.setString(1, LocTo);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                l.add(new TheRoute(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("eq_id"), rs.getString("loc_from"),
                        rs.getString("loc_to"), rs.getString("dates"), rs.getString("categories").charAt(0),
                        rs.getInt("passenger"), rs.getInt("luggage"), rs.getInt("status")));
            }
            return l;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }
    // End The Route

    // Start Notifications
    public void insertNotifications(Notifications n) {
        try {
            connected();
            car = bridge.prepareStatement("insert notifications(user_id_from, user_id_to, route_id, count_passenger, count_luggage, note, status) values (?, ?, ?, ?, ?, ?, ?)");
            car.setInt(1, n.getUser_id_from());
            car.setInt(2, n.getUser_id_to());
            car.setInt(3, n.getRoute_id());
            car.setInt(4, n.getCount_passenger());
            car.setDouble(5, n.getCount_luggage());
            car.setString(6, n.getNote());
            car.setInt(7, 1);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }

    }

    public List<Notifications> listMyNotificationsForNewEvent(int id) {
        try {
            connected();
            List<Notifications> list = new ArrayList<Notifications>();
            car = bridge.prepareStatement("select * from notifications where status!=0 and status!=3 and user_id_to=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Notifications(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"),
                        rs.getInt("route_id"), rs.getInt("count_passenger"), rs.getDouble("count_luggage"),
                        rs.getString("note"), rs.getInt("status")));

            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public List<Notifications> listMyNotificationsForNewEventClient(int id) {
        try {
            connected();
            List<Notifications> list = new ArrayList<Notifications>();
            car = bridge.prepareStatement("select * from notifications where status!=1 and status!=2 and user_id_from=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Notifications(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"),
                        rs.getInt("route_id"), rs.getInt("count_passenger"), rs.getDouble("count_luggage"),
                        rs.getString("note"), rs.getInt("status")));

            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public List<Notifications> listMyNotifications(int id) {
        try {
            connected();
            List<Notifications> list = new ArrayList<Notifications>();
            car = bridge.prepareStatement("select * from notifications where user_id_to=" + id);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Notifications(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"),
                        rs.getInt("route_id"), rs.getInt("count_passenger"), rs.getDouble("count_luggage"),
                        rs.getString("note"), rs.getInt("status")));

            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }

    }

    public List<Notifications> listMyOrder(int myId) {
        try {
            connected();
            List<Notifications> list = new ArrayList<Notifications>();
            car = bridge.prepareStatement("select * from notifications where status!=2 and user_id_from=" + myId);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Notifications(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"), rs.getInt("route_id"), rs.getInt("count_passenger"),
                        rs.getDouble("count_luggage"), rs.getString("note"), rs.getInt("status")));
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public void cancelOrderClient(int Nid) {
        try {
            connected();
            car = bridge.prepareStatement("update notifications set status=2 where id=" + Nid);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void cancelOrderOwner1(int Nid) {
        try {
            connected();
            car = bridge.prepareStatement("update notifications set status=3 where id=" + Nid);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void cancelOrderOwner0(int Nid, int Rid, int passCount, double luggCount) {
        try {
            connected();
            car = bridge.prepareStatement("update notifications set status=3 where id=" + Nid);
            car.executeUpdate();
            car = bridge.prepareStatement("update the_route set passenger=? , luggage=? where id=?");
            car.setInt(1, passCount);
            car.setDouble(2, luggCount);
            car.setInt(3, Rid);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void cancelOrderClient0(int Nid, int Rid, int passCount, double luggCount) {
        try {
            connected();
            car = bridge.prepareStatement("update notifications set status=2 where id=" + Nid);
            car.executeUpdate();
            car = bridge.prepareStatement("update the_route set passenger=? , luggage=? where id=?");
            car.setInt(1, passCount);
            car.setDouble(2, luggCount);
            car.setInt(3, Rid);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public void acceptOrder(int Nid, int Rid, int passCount, double luggCount) {
        try {
            connected();
            car = bridge.prepareStatement("update notifications set status=0 where id=" + Nid);
            car.executeUpdate();
            car = bridge.prepareStatement("update the_route set passenger=? , luggage=? where id=?");
            car.setInt(1, passCount);
            car.setDouble(2, luggCount);
            car.setInt(3, Rid);
            car.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public Notifications findByNid(int Nid) {
        try {
            connected();
            Notifications n = new Notifications();
            car = bridge.prepareStatement("select * from notifications where id=" + Nid);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                n.setId(rs.getInt("id"));
                n.setUser_id_from(rs.getInt("user_id_from"));
                n.setUser_id_to(rs.getInt("user_id_to"));
                n.setRoute_id(rs.getInt("route_id"));
                n.setCount_passenger(rs.getInt("count_passenger"));
                n.setCount_luggage(rs.getDouble("count_luggage"));
                n.setNote(rs.getString("note"));
                n.setStatus(rs.getInt("status"));
            }
            return n;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public int countSenderNotificationPass(int id_from, int id_to, int id_route) {
        try {
            connected();
            int count = 0;
            car = bridge.prepareStatement("select count_passenger from notifications where user_id_from=? and user_id_to=? and route_id=? and status=?");
            car.setInt(1, id_from);
            car.setInt(2, id_to);
            car.setInt(3, id_route);
            car.setInt(4, 0);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                count += rs.getInt("count_passenger");
            }
            return count;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            myClose();
        }
    }

    public double countSenderNotificationLuggage(int id_from, int id_to, int id_route) {
        try {
            connected();
            double count = 0;
            car = bridge.prepareStatement("select count_luggage from notifications where user_id_from=? and user_id_to=? and route_id=? and status=?");
            car.setInt(1, id_from);
            car.setInt(2, id_to);
            car.setInt(3, id_route);
            car.setInt(4, 0);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                count += rs.getDouble("count_luggage");
            }
            return count;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            myClose();
        }
    }

    //End Notifications
    //Start Messages
    public List<Integer> listUserId(int user_id_to) {
        try {
            connected();
            List<Integer> list = new ArrayList<Integer>();
            car = bridge.prepareStatement("select DISTINCT user_id_from from messages where user_id_to=" + user_id_to);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt("user_id_from"));
            }

            car = bridge.prepareStatement("select DISTINCT user_id_to from messages where user_id_from=" + user_id_to);
            ResultSet rs1 = car.executeQuery();
            while (rs1.next()) {
                if (!list.contains(rs1.getInt("user_id_to"))) {
                    list.add(rs1.getInt("user_id_to"));
                }

            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public List<Users> listUsersForMessages(int user_id_to) {
        try {

            List<Users> list = new ArrayList<Users>();
            for (Integer idler : listUserId(user_id_to)) {
                connected();
                car = bridge.prepareStatement("select * from users where id=" + idler);
                ResultSet rs = car.executeQuery();
                while (rs.next()) {
                    list.add(new Users(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),
                            rs.getString("father_name"), rs.getString("gender").charAt(0),
                            rs.getString("email"), rs.getString("username"), rs.getString("password"),
                            rs.getString("phone"), rs.getString("date_of_birth"),
                            rs.getBytes("image"), rs.getString("description"),
                            rs.getString("languages"), rs.getString("register"), rs.getInt("status"), rs.getInt("role")));
                }
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public List<Messages> listMessages(int id_from, int id_to) {
        try {
            connected();
            List<Messages> list = new ArrayList<Messages>();
            car = bridge.prepareStatement("select * from messages where (user_id_to=? and user_id_from=?) or (user_id_to=? and user_id_from=?)");
            car.setInt(1, id_to);
            car.setInt(2, id_from);
            car.setInt(3, id_from);
            car.setInt(4, id_to);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(new Messages(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"),
                        rs.getString("message"), rs.getInt("read_unread"), rs.getString("date_message"),
                        rs.getInt("status")));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public void insertMessage(int id_from, int id_to, String message) {
        try {
            connected();
            car = bridge.prepareStatement("insert into messages(user_id_from, user_id_to, message, read_unread, date_message, status) values (?,?,?,?,?,?)");
            car.setInt(1, id_from);
            car.setInt(2, id_to);
            car.setString(3, message);
            car.setInt(4, 1);
            car.setString(5, sdf.format(new Date()));
            car.setInt(6, 1);
            car.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();

        }
    }

    public void readUnread(int id_from) {
        try {
            connected();
            car = bridge.prepareStatement("update messages set read_unread=0 where user_id_from=" + id_from);
            car.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myClose();
        }
    }

    public List<Integer> countNewMessage(int id_to) {
        try {
            connected();
            List<Integer> list = new ArrayList<Integer>();
            car = bridge.prepareStatement("select DISTINCT(user_id_from) from messages where read_unread=1 and user_id_to=" + id_to);
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt("user_id_from"));
            }

            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    // For Admin Pages
    public List<Integer> listUserIdAdmin() {
        try {
            connected();
            List<Integer> list = new ArrayList<Integer>();
            car = bridge.prepareStatement("select DISTINCT user_id_from from messages");
            ResultSet rs = car.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt("user_id_from"));
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

    public List<Users> listUsersForMessagesAdmin() {
        try {
            List<Users> list = new ArrayList<Users>();
            for (Integer idler : listUserIdAdmin()) {
                connected();
                car = bridge.prepareStatement("select * from users where id=" + idler);
                ResultSet rs = car.executeQuery();
                while (rs.next()) {
                    list.add(new Users(rs.getInt("id"), rs.getString("name"), rs.getString("surname"),
                            rs.getString("father_name"), rs.getString("gender").charAt(0),
                            rs.getString("email"), rs.getString("username"), rs.getString("password"),
                            rs.getString("phone"), rs.getString("date_of_birth"),
                            rs.getBytes("image"), rs.getString("description"),
                            rs.getString("languages"), rs.getString("register"), rs.getInt("status"), rs.getInt("role")));
                }
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            myClose();
        }
    }

}
