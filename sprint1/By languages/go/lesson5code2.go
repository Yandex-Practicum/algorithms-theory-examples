import "time"

timeStart := time.Now()
i := 0
for i < 1000000000 {
    // Do nothing
    i++
}
timeFinish := time.Now()
timeSpan := timeFinish.Sub(timeStart)
fmt.Println(timeSpan, "seconds")
