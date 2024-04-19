package mx.untg.s33.graphql.db;

@SuppressWarnings("serial")
public class UnknownTeamException extends Exception {

    public UnknownTeamException(String message) {
        super(message);
    }
}