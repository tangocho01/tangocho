/*
 * Java bean class for entity table accounts 
 * Created on 1 May 2017 ( Date ISO 2017-05-01 - Time 07:41:27 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package model.entities;

import java.io.Serializable;


/**
 * Entity bean for table "accounts"
 * 
 * @author Telosys Tools Generator
 *
 */
public class Accounts implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer    id           ; // Primary Key

    private String     userName     ;
    private String     userPassword ;

    /**
     * Default constructor
     */
    public Accounts()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR THE PRIMARY KEY 
    //----------------------------------------------------------------------
    /**
     * Set the "id" field value
     * This field is mapped on the database column "id" ( type "serial", NotNull : true ) 
     * @param id
     */
	public void setId( Integer id )
    {
        this.id = id ;
    }
    /**
     * Get the "id" field value
     * This field is mapped on the database column "id" ( type "serial", NotNull : true ) 
     * @return the field value
     */
	public Integer getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR DATA FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : user_name ( varchar ) 
    /**
     * Set the "userName" field value
     * This field is mapped on the database column "user_name" ( type "varchar", NotNull : true ) 
     * @param userName
     */
    public void setUserName( String userName )
    {
        this.userName = userName;
    }
    /**
     * Get the "userName" field value
     * This field is mapped on the database column "user_name" ( type "varchar", NotNull : true ) 
     * @return the field value
     */
    public String getUserName()
    {
        return this.userName;
    }

    //--- DATABASE MAPPING : user_password ( varchar ) 
    /**
     * Set the "userPassword" field value
     * This field is mapped on the database column "user_password" ( type "varchar", NotNull : true ) 
     * @param userPassword
     */
    public void setUserPassword( String userPassword )
    {
        this.userPassword = userPassword;
    }
    /**
     * Get the "userPassword" field value
     * This field is mapped on the database column "user_password" ( type "varchar", NotNull : true ) 
     * @return the field value
     */
    public String getUserPassword()
    {
        return this.userPassword;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(userName);
        sb.append("|");
        sb.append(userPassword);
        return sb.toString(); 
    } 


}
