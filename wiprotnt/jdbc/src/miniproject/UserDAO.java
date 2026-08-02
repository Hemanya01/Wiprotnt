package miniproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class UserDAO {
	public String getUserType(String userID) {
        String userType = "";
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT USERTYPE FROM USERDETAILS WHERE USERID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userType = rs.getString("USERTYPE");
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userType;
    }
	public String getIncorrectAttempts(String userID) {
	    String message = "";
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "SELECT IncorrectAttempts FROM USERDETAILS WHERE UserID = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, userID);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            int attempts = rs.getInt("IncorrectAttempts");
	            if (attempts == 0)
	                message = "No Incorrect Attempt";
	            else if (attempts == 1)
	                message = "One Time";
	            else
	                message = "Incorrect Attempt Exceeded";
	        }
	        rs.close();
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return message;
	}
	public String changeUserType(String userID) {
	    String result = "";
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "UPDATE USERDETAILS SET USERTYPE = ? WHERE USERID = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, "Admin");
	        ps.setString(2, userID);
	        int rows = ps.executeUpdate();
	        if (rows > 0)
	            result = "Update Success";
	        else
	            result = "Update Failed";
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	public int getLockStatus() {
	    int count = 0;
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "SELECT COUNT(*) FROM USERDETAILS WHERE LOCKSTATUS = 0";
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	        rs.close();
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}
	public String changeName(String id, String name) {
	    String result = "";
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "UPDATE USERDETAILS SET NAME = ? WHERE USERID = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, name);
	        ps.setString(2, id);
	        int rows = ps.executeUpdate();
	        if (rows > 0)
	            result = "Success";
	        else
	            result = "Failed";
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	public String changePassword(String password) {
	    String result = "";
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "UPDATE USERDETAILS SET PASSWORD = ? WHERE USERTYPE = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, password);
	        ps.setString(2, "Admin");
	        int rows = ps.executeUpdate();
	        if (rows > 0)
	            result = "Changed";
	        else
	            result = "0";
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	public String addUser_1(UserBean bean) {
	    String result = "";
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "INSERT INTO USERDETAILS VALUES(?, ?, ?, ?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, bean.getUserID());
	        ps.setString(2, bean.getPassword());
	        ps.setString(3, bean.getName());
	        ps.setInt(4, bean.getIncorrectAttempts());
	        ps.setInt(5, bean.getLockStatus());
	        ps.setString(6, bean.getUserType());

	        int rows = ps.executeUpdate();
	        if (rows > 0)
	            result = "Success";
	        else
	            result = "Fail";
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	public String addUser_2(UserBean bean) {
	    String result = "";
	    try {
	        if (bean.getLockStatus() != 0) {
	            return "Fail";
	        }
	        Connection con = DBConnection.getConnection();
	        String query = "INSERT INTO USERDETAILS VALUES (?, ?, ?, ?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, bean.getUserID());
	        ps.setString(2, bean.getPassword());
	        ps.setString(3, bean.getName());
	        ps.setInt(4, bean.getIncorrectAttempts());
	        ps.setInt(5, bean.getLockStatus());
	        ps.setString(6, bean.getUserType());
	        int rows = ps.executeUpdate();
	        if (rows > 0)
	            result = "Success";
	        else
	            result = "Fail";
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	public ArrayList<UserBean> getUsers(String userType) {
	    ArrayList<UserBean> list = new ArrayList<UserBean>();
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "SELECT * FROM USERDETAILS WHERE USERTYPE = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, userType);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            UserBean bean = new UserBean();
	            bean.setUserID(rs.getString("USERID"));
	            bean.setPassword(rs.getString("PASSWORD"));
	            bean.setName(rs.getString("NAME"));
	            bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
	            bean.setLockStatus(rs.getInt("LOCKSTATUS"));
	            bean.setUserType(rs.getString("USERTYPE"));
	            list.add(bean);
	        }
	        rs.close();
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	public ArrayList<UserBean> storeAllRecords() {
	    ArrayList<UserBean> list = new ArrayList<UserBean>();
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "SELECT * FROM USERDETAILS";
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            UserBean bean = new UserBean();
	            bean.setUserID(rs.getString("USERID"));
	            bean.setPassword(rs.getString("PASSWORD"));
	            bean.setName(rs.getString("NAME"));
	            bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
	            bean.setLockStatus(rs.getInt("LOCKSTATUS"));
	            bean.setUserType(rs.getString("USERTYPE"));
	            list.add(bean);
	        }
	        rs.close();
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	public String[] getNames() {
	    String[] names = null;
	    try {
	        Connection con = DBConnection.getConnection();
	        String query = "SELECT NAME FROM USERDETAILS";
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();
	        int count = 0;
	        while (rs.next()) {
	            count++;
	        }
	        names = new String[count];
	        rs = ps.executeQuery();
	        int i = 0;
	        while (rs.next()) {
	            names[i] = rs.getString("NAME");
	            i++;
	        }
	        rs.close();
	        ps.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return names;
	}


}
