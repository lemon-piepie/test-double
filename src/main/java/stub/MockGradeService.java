package stub;

import java.util.Arrays;
import java.util.List;

public class MockGradeService extends GradeSystem{
    @Override
    public List<Double> gradesFor(long studentId) {

        return Arrays.asList(85.0, 95.0, 90.0);
    }
}
