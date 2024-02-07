# AppCursoAndroid

Este é um aplicativo Android desenvolvido em Kotlin para calcular um valor com base em distância, preço e autonomia.

## Estrutura do Layout (activity_main.xml)

...

## Pré-requisitos

Certifique-se de ter o Android Studio instalado em sua máquina antes de executar o aplicativo.

## Configuração do Projeto

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/AppCursoAndroid.git
   ```

2. Abra o projeto no Android Studio.

3. Execute o aplicativo em um emulador ou dispositivo Android.

4. **Configuração do Gradle:**

   O projeto utiliza o sistema de construção Gradle. Aqui estão algumas configurações importantes do arquivo `build.gradle`:

   ```gradle
   plugins {
       id("com.android.application")
       id("org.jetbrains.kotlin.android")
   }

   android {
       namespace = "br.com.drianodev.app"
       compileSdk = 34

       defaultConfig {
           applicationId = "br.com.drianodev.app"
           minSdk = 24
           targetSdk = 34
           versionCode = 1
           versionName = "1.0"

           testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
       }

       buildTypes {
           release {
               isMinifyEnabled = false
               proguardFiles(
                   getDefaultProguardFile("proguard-android-optimize.txt"),
                   "proguard-rules.pro"
               )
           }
       }
       compileOptions {
           sourceCompatibility = JavaVersion.VERSION_1_8
           targetCompatibility = JavaVersion.VERSION_1_8
       }
       kotlinOptions {
           jvmTarget = "1.8"
       }
       buildFeatures {
           viewBinding = true
       }
   }

   dependencies {

       implementation("androidx.core:core-ktx:1.10.1")
       implementation("androidx.appcompat:appcompat:1.6.1")
       implementation("com.google.android.material:material:1.9.0")
       implementation("androidx.constraintlayout:constraintlayout:2.1.4")
       testImplementation("junit:junit:4.13.2")
       androidTestImplementation("androidx.test.ext:junit:1.1.5")
       androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
   }
   ```

   Certifique-se de ajustar essas configurações conforme necessário.

## Funcionalidades

1. **Calculadora de Viagem**
    - Calcule o valor total de uma viagem com base na distância percorrida, preço do combustível e autonomia do veículo.

2. **Entrada de Dados Simples**
    - Utilize caixas de entrada de dados para inserir a distância, preço do combustível e autonomia do veículo.

3. **Visualização Clara**
    - Observe o resultado da viagem em uma visualização clara e legível.

## Capturas de Tela

Adicione algumas capturas de tela do aplicativo para fornecer uma visualização rápida das principais funcionalidades.

1. **Tela Inicial**
    - Descreva o que é mostrado na tela inicial.
      ![Tela Inicial](screenshots/tela_inicial.png)

2. **Calculando Resultado**
    - Exiba uma captura de tela do aplicativo enquanto realiza um cálculo.
      ![Calculando Resultado](screenshots/calculando_resultado.png)

3. **Mensagem de Erro**
    - Capture a tela exibindo mensagens de erro, se houver.
      ![Mensagem de Erro](screenshots/mensagem_erro.png)

---
**Desenvolvido por [Seu Nome]**
```