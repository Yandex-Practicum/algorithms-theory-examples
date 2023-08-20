import Foundation

let timeStart = Date().timeIntervalSince1970
var i = 0
while i < 1_000_000_000 {
    // Do nothing
    i += 1
}

let timeFinish = Date().timeIntervalSince1970
let timeSpan = timeFinish - timeStart
print("\(timeSpan) seconds")