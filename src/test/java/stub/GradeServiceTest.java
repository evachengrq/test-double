package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    @Mock
    private GradeSystem mockGradeSystem;
    @InjectMocks
    private GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        long studentId = 3638338;
        when(mockGradeSystem.gradesFor(studentId))
                .thenReturn(Arrays.asList(80.0, 90.0, 100.0));

        double result = gradeService.calculateAverageGrades(studentId);
        Assertions.assertEquals(90.0, result);
    }
}
