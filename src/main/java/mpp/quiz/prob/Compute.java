package mpp.quiz.prob;

public interface Compute {
    default int operation(int x, int y){
        return x - y;
    }

    static int add(int x, int y){
        return x+y;
    }
}
