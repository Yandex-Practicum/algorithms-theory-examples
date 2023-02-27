import kotlin.system.measureTimeMillis

val timeSpan = measureTimeMillis {
    var i = 0
    while (i < 1000000000) {
        // Do nothing
        i++
    }
}

println("$timeSpan milliseconds")