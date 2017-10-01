using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace TMAAT_WebAPI.Controllers
{
    [RoutePrefix("api")]
    public class ImageController : ApiController
    {
        [HttpGet] [Route("test")]
        public IHttpActionResult Test() {
            return Ok();
        }
    }
}
