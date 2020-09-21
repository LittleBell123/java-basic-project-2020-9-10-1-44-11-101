package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemaTest {

    @Test
    public void should_return_Boolean_when_given_l(){
        Schema schema = new Schema("l:bool");
        Assert.assertEquals(schema.getValue("l","true"),Boolean.TRUE);
        Assert.assertEquals(schema.getValue("l","false"),Boolean.FALSE);
        Assert.assertEquals(schema.getValue("l",null),Boolean.FALSE);
    }



}
