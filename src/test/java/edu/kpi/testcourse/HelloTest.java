package edu.kpi.testcourse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

  @Test
  void simpleAlwaysGreenTest() {
    assertThat(5).isEqualTo(5);
  }

}
