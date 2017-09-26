package com.jmk.dao.util;

/**
 * This class contains the sql query of every operation in database
 *
 * @author mulayam
 *
 */
public class SQLConstant {

    public static final String SQL_INSERT_CONTAINER = "insert into container (name,security_money) values(?,?)";
    public static final String SQL_SELECT_ALL_CONTAINER = "select container_id,container_name,security_money from containers";
    public static final String SQL_UPDATE_CONTAINER = "update container set name=?,security_money=? where container_id=?";

    public static final String SQL_INSERT_ITEM = "insert into container (item_name,status) values(?,?)";

    public static final String SQL_INSERT_USER = "insert into user(user_name,password,mobile1,mobile2,address,user_role,status)values(?,?,?,?,?,?,?)";

    public static final String SQL_INSERT_GRANTER = "insert into granter(user_id,name,id_number,id_type)values(?,?,?,?)";
    public static final String SQL_SELECT_ALL_GRANTERS = "";

    public static final String SQL_INSERT_CUSTOMER = "insert into customer(granter_id,user_id,name,id_number,id_type)values(?,?,?,?,?)";
    public static final String SQL_SELECT_ALL_CUSTOMER = "select c.customer_id,c.granter_id,c.id_number,c.id_type,c.name,"
            + "c.user_id,u.address,u.mobile1,u.mobile2,"
            + "u.status,u.user_name,u.user_role,ca.current_balance from customer c join "
            + "user u on u.user_id=c.user_id  "
            + "left join "
            + "(select customer_id, current_balance from customer_account where transaction_id in"
            + "(select max(transaction_id) from customer_account group by customer_id)) ca on ca.customer_id=c.customer_id";
    public static final String SQL_SELECT_CUSTOMER_BY_ID = "select c.customer_id,c.granter_id,c.id_number,c.id_type,c.name,c.user_id,u.address,u.mobile1,u.mobile2,u.status,u.user_name,u.user_role from customer c join user u on u.user_id=c.user_id order by c.name where c.customer_id=?";

    public static final String SQL_INSERT_ACCOUNT_TRANSACTION = "insert into customer_account(customer_id,product_amount,security_money,coolie_amount,debit_amount,credit_amount,transaction_type,description,current_balance)values(?,?,?,?,?,?,?,?,?)";
    public static final String SQL_SELECT_CURRENT_BALANCE = "select current_balance from customer_account  where customer_id=? order by transaction_id desc limit 1";

    public static final String SQL_SELECT_TRANSACTION_BY_CUSTOMER_ID = "SELECT transaction_id,customer_id,product_amount,security_money,coolie_amount,debit_amount,credit_amount,transaction_type,description,current_balance,transaction_date FROM customer_account where customer_id=?";
    public static final String SQL_SELECT_ALL_ITEMS = "select item_id,item_name from items order by item_name";

    public static final String SQL_INSERT_CONTAINER_ACCOUNT = "insert into container_account  (transaction_id,customer_id, container_id, credit, debit, sec_money,current_balance) VALUES ( ?, ?, ?, ?, ?, ?, ?)";

    public static final String SQL_INSERT_SALE_ITEMS = "insert into sale_Items (transaction_id, item_id, weight, price) VALUES (?, ?, ?, ?)";

}
