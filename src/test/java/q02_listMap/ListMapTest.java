package q02_listMap;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DisplayName("Q2 ListMap Test")
public class ListMapTest {

    private ListMapInterface listMap;

    @Nested
    class Level1 {

        @BeforeEach
        public void init() {
            listMap = new ListMap();
            listMap.add("A", 3);
            listMap.add("A", 4);
            listMap.add("A", 3);
        }

        @AfterEach
        public void deinit() {
            listMap = null;
        }

        @Test
        public void test1() {
            assertEquals("[3, 4, 3]", listMap.get("A").toString());
        }

        @Test
        public void test2() {
            listMap.removeFirst("A", 3);
            assertEquals("[4, 3]", listMap.get("A").toString());

            listMap.removeFirst("A", 4);
            assertEquals("[3]", listMap.get("A").toString());

            listMap.removeFirst("A", 3);
            assertEquals("[]", listMap.get("A").toString());
        }

        @Test
        public void test3() {
            listMap.removeLast("A", 3);
            assertEquals("[3, 4]", listMap.get("A").toString());
        }

        @Test
        public void test4() {
            listMap.removeAll("A", 3);
            assertEquals("[4]", listMap.get("A").toString());
        }

        @Test
        public void test5() {
            listMap.remove("A");
            assertNull(listMap.get("A"));
        }

        @Test
        public void test6() {
            assertTrue(listMap.containsKey("A"));
            assertTrue(!listMap.containsKey("B"));
            listMap.remove("A");
            assertTrue(!listMap.containsKey("A"));
        }
    }

}
