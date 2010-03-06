package com.github.nowelium.phpbuf;

import java.util.logging.Logger;

import com.github.nowelium.phpbuf.ExampleSearch.Web;
import com.github.nowelium.phpbuf.ExampleSearch.Request.SearchRequest;
import com.github.nowelium.phpbuf.ExampleSearch.Response.SearchResult;
import com.github.nowelium.phpbuf.ExampleSearch.Web.SiteType;
import com.google.protobuf.RpcController;
import com.google.protobuf.ServiceException;

public class SearchServiceImpl implements ExampleSearch.SearchService.BlockingInterface {

    private final Logger logger = Logger.getLogger(SearchServiceImpl.class.getName());
    
    public SearchResult search(RpcController controller, SearchRequest request) throws ServiceException {
        String query = request.getQuery();
        logger.info("input query => " + query);
        return search(query);
    }
    
    protected SearchResult search(String query){
        final SearchResult.Builder result = SearchResult.newBuilder();
        {
            Web.Site.Builder builder = Web.Site.newBuilder();
            builder.setTitle("example 1 - " + query);
            builder.setUrl("http://www.example.com/");
            builder.setType(SiteType.NEWS);
            result.addSites(builder.build());
        }
        {
            Web.Site.Builder builder = Web.Site.newBuilder();
            builder.setTitle("example 2 - " + query);
            builder.setUrl("http://www.example.net/");
            builder.setType(SiteType.UNKNOWN);
            result.addSites(builder.build());
        }
        return result.build();
    }

}
