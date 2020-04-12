package com.soywiz.korma.geom

import kotlin.test.*

class PointArrayListTest {
    @Test
    fun reverse() {
        assertEquals("[(1, 1)]", PointIntArrayList().apply { add(1, 1) }.apply { reverse() }.toString())
        assertEquals("[(2, 2), (1, 1)]", PointIntArrayList().apply { add(1, 1).add(2, 2) }.apply { reverse() }.toString())
        assertEquals("[(3, 3), (2, 2), (1, 1)]", PointIntArrayList().apply { add(1, 1).add(2, 2).add(3, 3) }.apply { reverse() }.toString())
    }

    @Test
    fun testClear() {
        val p = PointArrayList()
        p.add(1, 1)
        assertEquals("[(1, 1)]", p.toList().toString())
        p.add(2, 2)
        assertEquals("[(1, 1), (2, 2)]", p.toList().toString())
        assertEquals(2, p.size)
        p.clear()
        assertEquals(0, p.size)
        assertEquals("[]", p.toList().toString())
        p.add(2, 2)
        assertEquals(1, p.size)
        assertEquals("[(2, 2)]", p.toList().toString())

    }
}
