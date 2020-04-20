/*
 * Copyright (C) Jini Guru Technologies (Mauritius) Limited - Company No. : 154309 - All Rights Reserved Unauthorized copying of
 * this file or any of its contents, via any medium is strictly prohibited Proprietary and confidential
 */

package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * REST Web Service.
 *
 * @author Paul Carter-Brown
 */
@ApplicationScoped
@Path("/test")
public class TestResource {

    private static final Logger log = LoggerFactory.getLogger(TestResource.class);

    @GET
    public Response getTest() {
        log.info("In rest service");
        return Response.ok("Rest service Works!", MediaType.TEXT_PLAIN).build();
    }

}
