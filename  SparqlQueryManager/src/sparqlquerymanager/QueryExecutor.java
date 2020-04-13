package sparqlquerymanager;

import java.io.ByteArrayOutputStream;
import java.io.File;
import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QueryParseException;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.RDFDataMgr;

public class QueryExecutor {

    public QueryExecutor() {
        LogCtl.setCmdLogging();
    }
    
    public String queryInLocalFile(String file, String query){
        Model model       = RDFDataMgr.loadModel(file);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            Query sparqlQuery = QueryFactory.create(query);
            try (QueryExecution execute = QueryExecutionFactory.create(sparqlQuery,model)) {
               ResultSet result = execute.execSelect();
               ResultSetFormatter.out(stream, result);
           }
           return new String(stream.toByteArray());   
        } catch (QueryParseException e) {
            return "Query Error: " + e.getMessage();
        }
    }
    
    public String queryInEndpoint(String url, String query){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            Query sparqlQuery = QueryFactory.create(query);
            try (QueryExecution execute = QueryExecutionFactory.sparqlService(
                    url, sparqlQuery)) {
               ResultSet result = execute.execSelect();
               ResultSetFormatter.out(stream, result);
           }
           return new String(stream.toByteArray());   
        } catch (QueryParseException e) {
            return "Query Error: " + e.getMessage();
        }
    }
    
    
}
