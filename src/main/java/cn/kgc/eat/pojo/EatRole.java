package cn.kgc.eat.pojo;

public class EatRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_role.ROLE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_role.ROLE _NAME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private String roleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_role.ROLE_ID
     *
     * @return the value of eat_role.ROLE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_role.ROLE_ID
     *
     * @param roleId the value for eat_role.ROLE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_role.ROLE _NAME
     *
     * @return the value of eat_role.ROLE _NAME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_role.ROLE _NAME
     *
     * @param roleName the value for eat_role.ROLE _NAME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}