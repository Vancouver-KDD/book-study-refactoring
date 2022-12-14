# Builder Pattern

### ๐ ์์ฑ์์ ๋งค๊ฐ๋ณ์๊ฐ ๋ง๋ค๋ฉด ๋น๋๋ฅผ ๊ณ ๋ คํ๋ผ!

**๋์ผํ ํ๋ก์ธ์ค**๋ฅผ ๊ฑฐ์ณ ๋ค์ํ ๊ตฌ์ฑ์ **์ธ์คํด์ค๋ฅผ ๋ง๋๋ ๋ฐฉ๋ฒ**.
* (๋ณต์กํ) ๊ฐ์ฒด๋ฅผ ๋ง๋๋ ํ๋ก์ธ์ค๋ฅผ ๋๋ฆฝ์ ์ผ๋ก ๋ถ๋ฆฌํ  ์ ์๋ค.

![](images/builderClassDiagram.png)
## 1. Implementation
* Fluent API(Interface) ๋๋  Method chaining ์ผ๋ก ๊ตฌํํ๋ค.
* ์์ฑ์๋ ์๋ฐ๋น์ฆ ๋ณด๋ค ์์ ํ๋ค.

![](images/tourPlan.png)
## 2. Pros and cons
* ์ฅ์ : 
  * ๋ง๋ค๊ธฐ ๋ณต์กํ ๊ฐ์ฒด๋ฅผ ์์ฐจ์ ์ผ๋ก ๋ง๋ค ์ ์๋ค.
  * ๋ณต์กํ ๊ฐ์ฒด๋ฅผ ๋ง๋๋ ๊ตฌ์ฒด์ ์ธ ๊ณผ์ ์ ์จ๊ธธ ์ ์๋ค.
  * ๋์ผํ ํ๋ก์ธ์ค๋ฅผ ํตํด ๊ฐ๊ธฐ ๋ค๋ฅด๊ฒ ๊ตฌ์ฑ๋ ๊ฐ์ฒด๋ฅผ ๋ง๋ค ์ ์๋ค.
  * ๋ถ์์ ํ ๊ฐ์ฒด๋ฅผ ์ฌ์ฉํ์ง ๋ชปํ๋๋ก ๋ฐฉ์ง ํ  ์ ์๋ค.
  * ํด๋์ค๋ฅผ ๋ถ๋ณ(immutable)์ผ๋ก ๋ง๋ค ์ ์๋ค.
* ๋จ์ 
  * ์ํ๋ ๊ฐ์ฒด๋ฅผ ๋ง๋ค๋ ค๋ฉด ๋น๋๋ถํฐ ๋ง๋ค์ด์ผ ํ๋ค.
  * ๊ตฌ์กฐ๊ฐ ๋ณต์กํด ์ง๋ค.

## 3. Example
* ์๋ฐ 8 Stream.Builder API
* StringBuilder
* ๋กฌ๋ถ @Builder
* Spring
  * UriComponentsBuilder
  * MockMvcWebClientBuilder
  * ... Builder
* ProtocolBuffers

## 4. Etc.
* ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ ๋ค์ํ ๋ฐฉ๋ฒ
  * Constructor
  > public ClassName(int param1, String param2) { ... }
  * Static Factory Method
  > of newInstance, getInstance, getService ...
  > 
  > ![](images/listof.png)
  * Builder
  > ![](images/ProtocolBuffers.png)
