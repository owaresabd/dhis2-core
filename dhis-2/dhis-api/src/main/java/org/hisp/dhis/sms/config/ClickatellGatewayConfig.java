package org.hisp.dhis.sms.config;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Copyright (c) 2004-2016, University of Oslo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * Neither the name of the HISP project nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * @author Zubair <rajazubair.asghar@gmail.com>
 */
public class ClickatellGatewayConfig
    extends SmsGatewayConfig
{
    private static final long serialVersionUID = -4286107769356591957L;
    
    private final String TOKEN_PREFIX = "Bearer ";
    
    private final String URL_TEMPLATE = "https://api.clickatell.com/rest/message";

    private String username;

    private String password;
    
    private String authToken;

    @JsonProperty( value = "authtoken" )
    public String getAuthToken()
    {
        return authToken;
    }

    public void setAuthToken( String authToken )
    {
        this.authToken = TOKEN_PREFIX + authToken;
    }

    @JsonProperty( value = "username" )
    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    @JsonProperty( value = "default" )
    public boolean getStatus()
    {
        return super.isDefault();
    }

    @JsonProperty
    public void setPassword( String password )
    {
        this.password = password;
    }

    @JsonProperty( value = "name" )
    public String getName()
    {
        return super.getName();
    }

    @Override
    public boolean isInbound()
    {
        return false;
    }

    @Override
    public boolean isOutbound()
    {
        return true;
    }
    
    @Override
    @JsonProperty( value = "urlTemplate" )
    public String getUrlTemplate()
    {
        return this.URL_TEMPLATE;
    }
}
