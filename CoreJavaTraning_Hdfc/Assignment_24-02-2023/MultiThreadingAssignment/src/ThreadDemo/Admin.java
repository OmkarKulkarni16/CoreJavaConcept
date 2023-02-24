package ThreadDemo;

public class Admin extends User{
    private int adminId;
    private String adminName;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        super.setId(adminId);
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        super.setName(adminName);
        this.adminName = adminName;
    }
}
