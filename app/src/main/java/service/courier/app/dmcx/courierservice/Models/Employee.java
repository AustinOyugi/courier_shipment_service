package service.courier.app.dmcx.courierservice.Models;

public class Employee {

    private String image_path;
    private String id;
    private String name;
    private String admin_id;
    private String phone_no;
    private long created_at;
    private long modified_at;
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getImage_path() {
        return image_path;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public long getCreated_at() {
        return created_at;
    }

    public long getModified_at() {
        return modified_at;
    }

    @Override
    public String toString() {
        return id+" "+image_path+" "+name+" "+admin_id+" "+phone_no+" "+created_at+" "+modified_at;
    }
}
