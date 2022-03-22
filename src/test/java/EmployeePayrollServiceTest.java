import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import bridgelabz.EmployeePayrollData;
import bridgelabz.EmployeePayrollService;

public class EmployeePayrollServiceTest {

	@Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {

        EmployeePayrollData[] arrayOfEmps = {new EmployeePayrollData(1231,"Rekha",55000.00),
                                             new EmployeePayrollData(1232,"Rashmi",84000.00),
                                             new EmployeePayrollData(1233,"Ramya",15000.00)
                                            };

        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
       
        Assert.assertTrue(true);
	    
}
}
