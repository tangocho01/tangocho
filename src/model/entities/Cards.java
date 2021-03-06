/*
 * Java bean class for entity table cards 
 * Created on 21 May 2017 ( Date ISO 2017-05-21 - Time 08:48:46 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package model.entities;

import java.io.Serializable;

import java.util.Date;

/**
 * Entity bean for table "cards"
 * 
 * @author Telosys Tools Generator
 *
 */
public class Cards implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer    id           ; // Primary Key

    private Integer    deckId       ;
    private String     question     ;
    private String     answer       ;
    private Date       lastTime     ;
    private Integer    nextTime     ;
    private Boolean    reviewed     ;
    private Boolean    skip         ;

    /**
     * Default constructor
     */
    public Cards()
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
    //--- DATABASE MAPPING : deck_id ( int4 ) 
    /**
     * Set the "deckId" field value
     * This field is mapped on the database column "deck_id" ( type "int4", NotNull : true ) 
     * @param deckId
     */
    public void setDeckId( Integer deckId )
    {
        this.deckId = deckId;
    }
    /**
     * Get the "deckId" field value
     * This field is mapped on the database column "deck_id" ( type "int4", NotNull : true ) 
     * @return the field value
     */
    public Integer getDeckId()
    {
        return this.deckId;
    }

    //--- DATABASE MAPPING : question ( varchar ) 
    /**
     * Set the "question" field value
     * This field is mapped on the database column "question" ( type "varchar", NotNull : true ) 
     * @param question
     */
    public void setQuestion( String question )
    {
        this.question = question;
    }
    /**
     * Get the "question" field value
     * This field is mapped on the database column "question" ( type "varchar", NotNull : true ) 
     * @return the field value
     */
    public String getQuestion()
    {
        return this.question;
    }

    //--- DATABASE MAPPING : answer ( varchar ) 
    /**
     * Set the "answer" field value
     * This field is mapped on the database column "answer" ( type "varchar", NotNull : true ) 
     * @param answer
     */
    public void setAnswer( String answer )
    {
        this.answer = answer;
    }
    /**
     * Get the "answer" field value
     * This field is mapped on the database column "answer" ( type "varchar", NotNull : true ) 
     * @return the field value
     */
    public String getAnswer()
    {
        return this.answer;
    }

    //--- DATABASE MAPPING : last_time ( timestamp ) 
    /**
     * Set the "lastTime" field value
     * This field is mapped on the database column "last_time" ( type "timestamp", NotNull : false ) 
     * @param lastTime
     */
    public void setLastTime( Date lastTime )
    {
        this.lastTime = lastTime;
    }
    /**
     * Get the "lastTime" field value
     * This field is mapped on the database column "last_time" ( type "timestamp", NotNull : false ) 
     * @return the field value
     */
    public Date getLastTime()
    {
        return this.lastTime;
    }

    //--- DATABASE MAPPING : next_time ( int4 ) 
    /**
     * Set the "nextTime" field value
     * This field is mapped on the database column "next_time" ( type "int4", NotNull : false ) 
     * @param nextTime
     */
    public void setNextTime( Integer nextTime )
    {
        this.nextTime = nextTime;
    }
    /**
     * Get the "nextTime" field value
     * This field is mapped on the database column "next_time" ( type "int4", NotNull : false ) 
     * @return the field value
     */
    public Integer getNextTime()
    {
        return this.nextTime;
    }

    //--- DATABASE MAPPING : reviewed ( bool ) 
    /**
     * Set the "reviewed" field value
     * This field is mapped on the database column "reviewed" ( type "bool", NotNull : false ) 
     * @param reviewed
     */
    public void setReviewed( Boolean reviewed )
    {
        this.reviewed = reviewed;
    }
    /**
     * Get the "reviewed" field value
     * This field is mapped on the database column "reviewed" ( type "bool", NotNull : false ) 
     * @return the field value
     */
    public Boolean getReviewed()
    {
        return this.reviewed;
    }

    //--- DATABASE MAPPING : skip ( bool ) 
    /**
     * Set the "skip" field value
     * This field is mapped on the database column "skip" ( type "bool", NotNull : true ) 
     * @param skip
     */
    public void setSkip( Boolean skip )
    {
        this.skip = skip;
    }
    /**
     * Get the "skip" field value
     * This field is mapped on the database column "skip" ( type "bool", NotNull : true ) 
     * @return the field value
     */
    public Boolean getSkip()
    {
        return this.skip;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(deckId);
        sb.append("|");
        sb.append(question);
        sb.append("|");
        sb.append(answer);
        sb.append("|");
        sb.append(lastTime);
        sb.append("|");
        sb.append(nextTime);
        sb.append("|");
        sb.append(reviewed);
        sb.append("|");
        sb.append(skip);
        return sb.toString(); 
    } 


}
