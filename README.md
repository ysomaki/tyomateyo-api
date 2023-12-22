# tyomateyo-api

## ローカル環境での開発

### 初期設定

1. Intellij IDEAを開く
2. 実行構成の編集 
3. 有効なプロファイルに`local`を入力

### ローカル環境でのDB接続

1. ▶ 実行ボタンを押す 
2. 起動ログから`Database available at 'xxxxxxxxxxx'`の部分をコピーする
3. http://localhost:8080/h2-console/ にアクセスする
4. `JDBC URL:`にコピーした文字列をペーストし、Connectを押す
5. コンソールでSQLを実行する 
   1. 例: `select * from "user";`

