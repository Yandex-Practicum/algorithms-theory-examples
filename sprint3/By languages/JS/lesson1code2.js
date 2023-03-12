const fs = require('fs');
const path = require('path');

function findFile(folder, fileToFind) {
  const files = fs.readdirSync(folder);
  for (const file of files) {
    const filePath = path.join(folder, file);
    const stats = fs.statSync(filePath);
    if (stats.isDirectory()) {
      // рекурсивно запустить поиск в подпапке
      const found = findFile(filePath, fileToFind);
      if (found) {
        // если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
        return found;
      }
    } else { // path — обычный файл
      if (path.basename(filePath) === fileToFind) {
        // если нашли нужный файл, то вернуть результат
        return filePath;
      }
    }
  }
  return null;
}

const folder = '/path/to/folder';
const fileToFind = 'file.txt';
const result = findFile(folder, fileToFind);
if (!result) {
  console.log('File not found');
} else {
  console.log('File found at ' + result);
}
