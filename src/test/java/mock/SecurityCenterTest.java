package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {

    @Mock
    private DoorPanel mockDoorPanel;
    @InjectMocks
    private SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();

        verify(mockDoorPanel, times(1)).close();
    }
}
