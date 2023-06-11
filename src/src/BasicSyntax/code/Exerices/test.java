package src.BasicSyntax.code.Exerices;

public class test {

    enum JobStatus{
        success,FAIL;
    }
    enum TestResult{
        pass,FAIL;
    }
    public static void main(String[] args) {
    JobStatus js = JobStatus.FAIL;
    TestResult tr = TestResult.FAIL;
    System.out.println(js.equals(tr));
    System.out.println(js == tr);
}