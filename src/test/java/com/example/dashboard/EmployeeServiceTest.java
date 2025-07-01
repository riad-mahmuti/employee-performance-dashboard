
package com.example.dashboard;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.dashboard.model.Employee;
import com.example.dashboard.repository.EmployeeRepository;
import com.example.dashboard.service.EmployeeService;

import org.junit.jupiter.api.Test;
import java.util.Collections;

public class EmployeeServiceTest {

    @Test
    public void testGetAllEmployees() {
        EmployeeRepository mockRepo = mock(EmployeeRepository.class);
        when(mockRepo.findAll()).thenReturn(Collections.emptyList());

        EmployeeService service = new EmployeeService(mockRepo);
        assertTrue(service.getAllEmployees().isEmpty());
    }
}
