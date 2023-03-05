const time_start = Date.now();
let i = 0;
while (i < 1000000000) {
    // Ничего не делаем
    i += 1;
}
const time_finish = Date.now();
const time_span = (time_finish - time_start) / 1000; // переводим миллисекунды в секунды
console.log(time_span, 'секунд');
