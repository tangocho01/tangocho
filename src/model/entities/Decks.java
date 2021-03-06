/*
 * Java bean class for entity table decks 
 * Created on 21 May 2017 ( Date ISO 2017-05-21 - Time 08:42:20 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package model.entities;

import java.io.Serializable;

import java.util.Date;

/**
 * Entity bean for table "decks"
 * 
 * @author Telosys Tools Generator
 *
 */
public class Decks implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer    id           ; // Primary Key

    private Integer    accountId    ;
    private String     description  ;
    private Date       lastAccess   ;

    /**
     * Default constructor
     */
    public Decks()
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
    //--- DATABASE MAPPING : account_id ( int4 ) 
    /**
     * Set the "accountId" field value
     * This field is mapped on the database column "account_id" ( type "int4", NotNull : true ) 
     * @param accountId
     */
    public void setAccountId( Integer accountId )
    {
        this.accountId = accountId;
    }
    /**
     * Get the "accountId" field value
     * This field is mapped on the database column "account_id" ( type "int4", NotNull : true ) 
     * @return the field value
     */
    public Integer getAccountId()
    {
        return this.accountId;
    }

    //--- DATABASE MAPPING : description ( varchar ) 
    /**
     * Set the "description" field value
     * This field is mapped on the database column "description" ( type "varchar", NotNull : false ) 
     * @param description
     */
    public void setDescription( String description )
    {
        this.description = description;
    }
    /**
     * Get the "description" field value
     * This field is mapped on the database column "description" ( type "varchar", NotNull : false ) 
     * @return the field value
     */
    public String getDescription()
    {
        return this.description;
    }

    //--- DATABASE MAPPING : last_access ( timestamp ) 
    /**
     * Set the "lastAccess" field value
     * This field is mapped on the database column "last_access" ( type "timestamp", NotNull : false ) 
     * @param lastAccess
     */
    public void setLastAccess( Date lastAccess )
    {
        this.lastAccess = lastAccess;
    }
    /**
     * Get the "lastAccess" field value
     * This field is mapped on the database column "last_access" ( type "timestamp", NotNull : false ) 
     * @return the field value
     */
    public Date getLastAccess()
    {
        return this.lastAccess;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(accountId);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(lastAccess);
        return sb.toString(); 
    } 


}
