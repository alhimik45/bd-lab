package bd

import java.util.*

internal object EventBus {

    private val map = HashMap<Events, ArrayList<() -> Unit>>()

    fun on(ev: Events, cb: () -> Unit) {
        if (!map.containsKey(ev)) {
            map.put(ev, ArrayList())
        }
        map[ev]!!.add(cb)
    }

    fun emit(ev: Events) {
        if (map.containsKey(ev)) {
            map[ev]!!.forEach { l -> l() }
        }
    }
}