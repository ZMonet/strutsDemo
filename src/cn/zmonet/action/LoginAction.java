package cn.zmonet.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;


public class LoginAction extends ActionSupport {

    private int id;
    private String userName;
    private String password;

    public LoginAction(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String execute() {
        Connection connection=null;
        String result=ERROR;
        try{
            String URL="jdbc:mysql://localhost:3306/zmonet?useSSL=false&serverTimezone=Hongkong&characterEncoding=utf-8&autoReconnect=true";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(URL,"root","123456");
            String sql="SELECT id from user WHERE userName=? AND password=?";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,password);

            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                result=SUCCESS;
            }
            else
                return ERROR;
        } catch (Exception e) {
          result=ERROR;
        }finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
         }
         return result;
        }

    }
