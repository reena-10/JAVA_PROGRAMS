import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {
private static final Object expect_result = 24;

@Test
public void doCalculationTest() {
	int actualresult = Service.docalculation(12,12);
		Assert.assertEquals(expect_result, actualresult);
}
}
