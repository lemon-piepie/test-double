package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    MockGradeService mockGradeService = new MockGradeService();
    GradeService gradeService = new GradeService(mockGradeService);
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeService gradeService = new GradeService(new MockGradeService());
        double result = gradeService.calculateAverageGrades(1L);
        Assertions.assertEquals(90.0, result);
    }
}
