package cn.kgc.eat.pojo;

import java.util.Date;

public class EatOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_PEOPLE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private String orderPeople;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_PHONE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private String orderPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_TIME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_DELIVERY_TIME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Date orderDeliveryTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_STATUS_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Long orderStatusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_order.ORDER_NUMBER
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Long orderNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_ID
     *
     * @return the value of eat_order.ORDER_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_ID
     *
     * @param orderId the value for eat_order.ORDER_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_PEOPLE
     *
     * @return the value of eat_order.ORDER_PEOPLE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public String getOrderPeople() {
        return orderPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_PEOPLE
     *
     * @param orderPeople the value for eat_order.ORDER_PEOPLE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderPeople(String orderPeople) {
        this.orderPeople = orderPeople == null ? null : orderPeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_PHONE
     *
     * @return the value of eat_order.ORDER_PHONE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public String getOrderPhone() {
        return orderPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_PHONE
     *
     * @param orderPhone the value for eat_order.ORDER_PHONE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_TIME
     *
     * @return the value of eat_order.ORDER_TIME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_TIME
     *
     * @param orderTime the value for eat_order.ORDER_TIME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_DELIVERY_TIME
     *
     * @return the value of eat_order.ORDER_DELIVERY_TIME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Date getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_DELIVERY_TIME
     *
     * @param orderDeliveryTime the value for eat_order.ORDER_DELIVERY_TIME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderDeliveryTime(Date orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_STATUS_ID
     *
     * @return the value of eat_order.ORDER_STATUS_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Long getOrderStatusId() {
        return orderStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_STATUS_ID
     *
     * @param orderStatusId the value for eat_order.ORDER_STATUS_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderStatusId(Long orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_order.ORDER_NUMBER
     *
     * @return the value of eat_order.ORDER_NUMBER
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Long getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_order.ORDER_NUMBER
     *
     * @param orderNumber the value for eat_order.ORDER_NUMBER
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }
}