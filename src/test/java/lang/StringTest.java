package lang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    @DisplayName("split 테스트 - 1,2를 ,로 split 하면 1을 포함해야한다.")
    public void splitContainFirstElementTest() {
        String origin = "1,2";
        String[] result = origin.split(",");

        assertThat(result).contains("1");
    }

    @Test
    @DisplayName("split 테스트 - 1,2를 ,로 split 하면 2를 포함해야한다.")
    public void splitContainLastElementTest() {
        String origin = "1,2";
        String[] result = origin.split(",");

        assertThat(result).contains("2");
    }
}
