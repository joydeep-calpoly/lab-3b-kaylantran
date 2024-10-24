package lab_3c;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    public void testGetDatabaseID() {
        Database mockDatabase = mock(Database.class);
        when(mockDatabase.getUniqueId()).thenReturn(101);
        Service service = new Service(mockDatabase);
        String expected = "Using database with id: 101";
        String actual = service.getDatabaseID();
        assertEquals(expected, actual, "Database ID should match the expected string");
        verify(mockDatabase).getUniqueId();
    }
}
