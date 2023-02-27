// visitors - массив номеров пассажиров.
// Каждый пассажир проехал столько раз, сколько раз встречается его номер
const visitors = [0,2,3,2,0,4,1,1,2];
const entries_by_visitor = [0, 0, 0, 0, 0];
let best_visitor = 0;

// Проходим по всем пассажирам и увеличиваем счётчик их посещений
for (let i = 0; i < visitors.length; i++) {
    const visitor = visitors[i];
    entries_by_visitor[visitor] += 1;
    // Если текущий пассажир имеет больше посещений, чем лучший пассажир, обновляем лучшего пассажира
    if (entries_by_visitor[visitor] > entries_by_visitor[best_visitor]) {
        best_visitor = visitor;
    }
}

// Выводим номер лучшего пассажира
console.log(best_visitor);
