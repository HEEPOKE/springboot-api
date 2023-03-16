# base

## Project build

```
./gradlew build
```

### Project run

```
./gradlew bootRun
```
### Project run other port

```
./gradlew bootRun --args='--server.port=9090'
```
./gradlew bootRun
```

#### generate key

```
keytool -genkeypair -alias mykey -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore mykeystore.p12
```
```
echo -n "your-secret" | openssl rsautl -encrypt -inkey mykey.pub -pubin | base64
```

#### open ssl

```
openssl genpkey -algorithm RSA -out private_key.pem -aes256
```
```
openssl rsa -pubout -in private_key.pem -out public_key.pem
```