package pl.cezarysanecki.gitapp.common;

public interface Result {

    record Success() implements Result {

    }

    record Failure(String reason) implements Result {

    }

}
