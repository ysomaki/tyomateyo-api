# tyomateyo-api

## ローカル環境での開発

### 初期設定

1. Intellij IDEAを開く
2. 実行構成の編集 
3. 有効なプロファイルに`local`を入力
   1. `application-local.properties`が読み込まれる

### ローカル環境DB

ローカル環境ではH2データベースを利用している。

直接DBを操作したい場合は、下記手順を実施する。

1. ▶ 実行ボタンを押し、アプリケーションを起動する
2. 起動ログから`Database available at 'xxxxxxxxxxx'`の部分をコピーする
3. http://localhost:8080/h2-console/ にアクセスする
4. `JDBC URL:`にコピーした文字列をペーストし、Connectを押す
5. コンソールでSQLを実行する 
   1. 例: `select * from "user";`

## API

実装するAPIは以下

|              | メソッド | エンドポイント        |
|:-------------|:----:|:---------------|
| アカウント登録      | POST | /accounts      |
| アカウント情報取得    | GET  | /accounts/{id} |
| アカウント情報変更    | PUT  | /accounts/{id} |
| アカウント認証      | POST | /auth          |
| ワンタイムパスワード作成 | POST | /one-time-pass |

- 例) アカウント情報取得
```shell
curl http://localhost:8080/accounts/1 | jq
```