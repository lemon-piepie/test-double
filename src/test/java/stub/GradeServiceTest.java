package stub;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
     */

    // @Mock
    GradeSystem mockGradeSystem = Mockito.mock(GradeSystem.class);
    GradeService gradeService = new GradeService(mockGradeSystem);

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(mockGradeSystem.gradesFor(0L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        double result = gradeService.calculateAverageGrades(0L);
        assertEquals(90.0, result);
    }
}
