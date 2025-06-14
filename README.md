# 🔨 Block Break Effects

✨ Mod para Minecraft Forge 1.20.1 que adiciona **efeitos visuais avançados, partículas personalizadas e animação suave da mão** ao quebrar blocos.

## 📸 Demonstração

https://github.com/user-attachments/assets/37270f0f-6b02-485b-a54d-9fa263abc68f

## 🎯 Funcionalidades

- 💥 Efeitos de partículas como `END_ROD` e `EXPLOSION` ao quebrar blocos.
- 👋 Animação personalizada do braço ao minerar.
- 🔄 Sistema de cooldown para evitar spam de animações.
- 🎵 Efeito sonoro exclusivo na quebra de blocos.
- 🔧 Código modular e organizado por pacotes.

## 🧩 Requisitos

- Minecraft `1.20.1`
- Forge `47.1.x` ou compatível
- Java `17`

## 🚀 Instalação

1. Baixe o arquivo `.jar` do [Releases](https://github.com/TheCoderZeus/BlockBreakEffects/releases)
2. Coloque o arquivo na pasta `mods` do seu `.minecraft`
3. Inicie o Minecraft com o Forge 1.20.1
4. ✅ Pronto!

## 🛠️ Desenvolvimento

Para compilar o mod localmente:

```bash
git clone https://github.com/TheCoderZeus/BlockBreakEffects.git
cd BlockBreakEffects
./gradlew build
```

*OBS: Tenha o gradle instalado no seu PC!*

# Estrutura do projeto!
src/main/java/com/splinter/blockbreakeffects/
├── BlockBreakEffectsMod.java
├── client/
│   ├── ClientEvents.java
│   ├── ClientProxy.java
│   └── ParticleHandler.java
├── common/
│   └── BlockBreakHandler.java
└── util/
    └── CooldownManager.java
