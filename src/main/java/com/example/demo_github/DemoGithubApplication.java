package com.example.demo_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;

@SpringBootApplication
public class DemoGithubApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoGithubApplication.class, args);
    }
}

@RestController
class HelloWorldController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> sayHello() {
        String html = """
            <!DOCTYPE html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Hello World</title>
                <style>
                    * { margin: 0; padding: 0; box-sizing: border-box; }

                    body {
                        min-height: 100vh;
                        display: flex;
                        align-items: center;
                        justify-content: center;
                        background: linear-gradient(135deg, #1a1a2e 0%, #16213e 50%, #0f3460 100%);
                        font-family: 'Segoe UI', sans-serif;
                        overflow: hidden;
                    }

                    .container {
                        text-align: center;
                        padding: 60px 80px;
                        background: rgba(255, 255, 255, 0.05);
                        border-radius: 24px;
                        border: 1px solid rgba(255, 255, 255, 0.1);
                        backdrop-filter: blur(20px);
                        box-shadow: 0 25px 50px rgba(0,0,0,0.5);
                        animation: fadeIn 1s ease;
                    }

                    .emoji {
                        font-size: 72px;
                        display: block;
                        margin-bottom: 20px;
                        animation: bounce 2s infinite;
                    }

                    h1 {
                        font-size: 56px;
                        font-weight: 800;
                        background: linear-gradient(90deg, #e94560, #0f3460, #533483);
                        -webkit-background-clip: text;
                        -webkit-text-fill-color: transparent;
                        background-clip: text;
                        margin-bottom: 12px;
                        letter-spacing: -1px;
                    }

                    .subtitle {
                        color: rgba(255,255,255,0.5);
                        font-size: 16px;
                        letter-spacing: 3px;
                        text-transform: uppercase;
                        margin-bottom: 40px;
                    }

                    .badges {
                        display: flex;
                        gap: 12px;
                        justify-content: center;
                        flex-wrap: wrap;
                        margin-bottom: 40px;
                    }

                    .badge {
                        padding: 8px 20px;
                        border-radius: 50px;
                        font-size: 13px;
                        font-weight: 600;
                        letter-spacing: 1px;
                    }

                    .badge-spring {
                        background: rgba(109, 179, 63, 0.15);
                        border: 1px solid rgba(109, 179, 63, 0.4);
                        color: #6db33f;
                    }

                    .badge-docker {
                        background: rgba(13, 183, 237, 0.15);
                        border: 1px solid rgba(13, 183, 237, 0.4);
                        color: #0db7ed;
                    }

                    .badge-java {
                        background: rgba(233, 69, 96, 0.15);
                        border: 1px solid rgba(233, 69, 96, 0.4);
                        color: #e94560;
                    }

                    .info {
                        color: rgba(255,255,255,0.3);
                        font-size: 13px;
                        margin-top: 8px;
                    }

                    .dot {
                        display: inline-block;
                        width: 8px;
                        height: 8px;
                        background: #6db33f;
                        border-radius: 50%;
                        margin-right: 6px;
                        animation: pulse 1.5s infinite;
                    }

                    @keyframes fadeIn {
                        from { opacity: 0; transform: translateY(30px); }
                        to   { opacity: 1; transform: translateY(0); }
                    }

                    @keyframes bounce {
                        0%, 100% { transform: translateY(0); }
                        50%       { transform: translateY(-12px); }
                    }

                    @keyframes pulse {
                        0%, 100% { opacity: 1; transform: scale(1); }
                        50%       { opacity: 0.5; transform: scale(1.4); }
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <span class="emoji">👋</span>
                    <h1>Hello, World!</h1>
                    <p class="subtitle">Spring Boot · Docker · IAM Master 2</p>
                    <div class="badges">
                        <span class="badge badge-spring">⚡ Spring Boot 4</span>
                        <span class="badge badge-docker">🐳 Docker</span>
                        <span class="badge badge-java">☕ Java 17</span>
                    </div>
                    <p class="info">
                        <span class="dot"></span>Application en cours d'exécution sur le port 8080
                    </p>
                </div>
            </body>
            </html>
        """;
        return ResponseEntity.ok()
            .contentType(MediaType.TEXT_HTML)
            .body(html);
    }
}
