package com.murat.weather;

public class TestHelper {

    public static String getLondonGeolocationJson() {
        return """
                    {
                        "name": "London",
                        "local_names": {
                            "ff": "London",
                            "st": "London",
                            "ug": "لوندۇن",
                            "kn": "ಲಂಡನ್",
                            "ga": "Londain",
                            "eu": "Londres",
                            "fi": "Lontoo",
                            "nl": "Londen",
                            "ca": "Londres",
                            "kk": "Лондон",
                            "zu": "ILondon",
                            "hr": "London",
                            "si": "ලන්ඩන්",
                            "sn": "London",
                            "vi": "Luân Đôn",
                            "zh": "伦敦",
                            "ha": "Landan",
                            "lv": "Londona",
                            "ba": "Лондон",
                            "af": "Londen",
                            "bn": "লন্ডন",
                            "pl": "Londyn",
                            "ja": "ロンドン",
                            "kw": "Loundres",
                            "sr": "Лондон",
                            "bh": "लंदन",
                            "da": "London",
                            "bm": "London",
                            "wa": "Londe",
                            "te": "లండన్",
                            "de": "London",
                            "el": "Λονδίνο",
                            "an": "Londres",
                            "sw": "London",
                            "ce": "Лондон",
                            "es": "Londres",
                            "ml": "ലണ്ടൻ",
                            "co": "Londra",
                            "ee": "London",
                            "et": "London",
                            "tt": "Лондон",
                            "cy": "Llundain",
                            "it": "Londra",
                            "sq": "Londra",
                            "pt": "Londres",
                            "so": "London",
                            "he": "לונדון",
                            "my": "လန်ဒန်မြို့",
                            "bg": "Лондон",
                            "fa": "لندن",
                            "ku": "London",
                            "eo": "Londono",
                            "ar": "لندن",
                            "sm": "Lonetona",
                            "tw": "London",
                            "mt": "Londra",
                            "fr": "Londres",
                            "li": "Londe",
                            "mi": "Rānana",
                            "ln": "Lóndɛlɛ",
                            "gv": "Lunnin",
                            "km": "ឡុងដ៍",
                            "hu": "London",
                            "ko": "런던",
                            "am": "ለንደን",
                            "sv": "London",
                            "gn": "Lóndyre",
                            "feature_name": "London",
                            "na": "London",
                            "ps": "لندن",
                            "en": "London",
                            "nv": "Tooh Dineʼé Bikin Haalʼá",
                            "br": "Londrez",
                            "sk": "Londýn",
                            "sc": "Londra",
                            "kv": "Лондон",
                            "ro": "Londra",
                            "ru": "Лондон",
                            "fy": "Londen",
                            "sd": "لنڊن",
                            "os": "Лондон",
                            "se": "London",
                            "mk": "Лондон",
                            "ay": "London",
                            "fj": "Lodoni",
                            "ascii": "London",
                            "tk": "London",
                            "ms": "London",
                            "tg": "Лондон",
                            "yi": "לאנדאן",
                            "sh": "London",
                            "oc": "Londres",
                            "rm": "Londra",
                            "ny": "London",
                            "wo": "Londar",
                            "ne": "लन्डन",
                            "cu": "Лондонъ",
                            "cs": "Londýn",
                            "uz": "London",
                            "hi": "लंदन",
                            "io": "London",
                            "ig": "London",
                            "kl": "London",
                            "tl": "Londres",
                            "is": "London",
                            "mn": "Лондон",
                            "or": "ଲଣ୍ଡନ",
                            "jv": "London",
                            "nn": "London",
                            "av": "Лондон",
                            "mr": "लंडन",
                            "uk": "Лондон",
                            "bs": "London",
                            "ta": "இலண்டன்",
                            "bi": "London",
                            "om": "Landan",
                            "gd": "Lunnainn",
                            "sl": "London",
                            "gl": "Londres",
                            "su": "London",
                            "lt": "Londonas",
                            "cv": "Лондон",
                            "ur": "علاقہ لندن",
                            "id": "London",
                            "mg": "Lôndôna",
                            "fo": "London",
                            "ie": "London",
                            "pa": "ਲੰਡਨ",
                            "ka": "ლონდონი",
                            "ky": "Лондон",
                            "no": "London",
                            "ab": "Лондон",
                            "sa": "लन्डन्",
                            "lb": "London",
                            "vo": "London",
                            "yo": "Lọndọnu",
                            "tr": "Londra",
                            "lo": "ລອນດອນ",
                            "th": "ลอนดอน",
                            "qu": "London",
                            "bo": "ལོན་ཊོན།",
                            "ia": "London",
                            "az": "London",
                            "hy": "Լոնդոն",
                            "to": "Lonitoni",
                            "gu": "લંડન",
                            "ht": "Lonn",
                            "be": "Лондан"
                        },
                        "lat": 51.5073219,
                        "lon": -0.1276474,
                        "country": "GB",
                        "state": "England"
                    }
                """;
    }

    public static String getLondonWeatherJson() {
        return """
                {
                    "lat": 51.5,
                    "lon": -0.12,
                    "timezone": "Europe/London",
                    "timezone_offset": 0,
                    "current": {
                        "dt": 1700433222,
                        "sunrise": 1700378681,
                        "sunset": 1700410031,
                        "temp": 11.48,
                        "feels_like": 10.85,
                        "pressure": 1007,
                        "humidity": 83,
                        "dew_point": 8.7,
                        "uvi": 0,
                        "clouds": 75,
                        "visibility": 10000,
                        "wind_speed": 7.72,
                        "wind_deg": 250,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04n"
                            }
                        ]
                    },
                    "hourly": [
                        {
                            "dt": 1700431200,
                            "temp": 11.53,
                            "feels_like": 10.83,
                            "pressure": 1008,
                            "humidity": 80,
                            "dew_point": 8.2,
                            "uvi": 0,
                            "clouds": 77,
                            "visibility": 10000,
                            "wind_speed": 6.52,
                            "wind_deg": 262,
                            "wind_gust": 12.56,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700434800,
                            "temp": 11.48,
                            "feels_like": 10.85,
                            "pressure": 1007,
                            "humidity": 83,
                            "dew_point": 8.7,
                            "uvi": 0,
                            "clouds": 75,
                            "visibility": 10000,
                            "wind_speed": 5.52,
                            "wind_deg": 258,
                            "wind_gust": 11.84,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700438400,
                            "temp": 11.53,
                            "feels_like": 10.8,
                            "pressure": 1008,
                            "humidity": 79,
                            "dew_point": 8.02,
                            "uvi": 0,
                            "clouds": 78,
                            "visibility": 10000,
                            "wind_speed": 6.65,
                            "wind_deg": 261,
                            "wind_gust": 12.47,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700442000,
                            "temp": 11.5,
                            "feels_like": 10.66,
                            "pressure": 1008,
                            "humidity": 75,
                            "dew_point": 7.23,
                            "uvi": 0,
                            "clouds": 85,
                            "visibility": 10000,
                            "wind_speed": 5.48,
                            "wind_deg": 251,
                            "wind_gust": 11.29,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700445600,
                            "temp": 10.8,
                            "feels_like": 9.97,
                            "pressure": 1009,
                            "humidity": 78,
                            "dew_point": 7.12,
                            "uvi": 0,
                            "clouds": 63,
                            "visibility": 10000,
                            "wind_speed": 5.3,
                            "wind_deg": 242,
                            "wind_gust": 11.06,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700449200,
                            "temp": 10.04,
                            "feels_like": 9.16,
                            "pressure": 1009,
                            "humidity": 79,
                            "dew_point": 6.57,
                            "uvi": 0,
                            "clouds": 53,
                            "visibility": 10000,
                            "wind_speed": 5.08,
                            "wind_deg": 238,
                            "wind_gust": 10.28,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700452800,
                            "temp": 9.2,
                            "feels_like": 6.64,
                            "pressure": 1009,
                            "humidity": 79,
                            "dew_point": 5.65,
                            "uvi": 0,
                            "clouds": 35,
                            "visibility": 10000,
                            "wind_speed": 4.86,
                            "wind_deg": 234,
                            "wind_gust": 10.58,
                            "weather": [
                                {
                                    "id": 802,
                                    "main": "Clouds",
                                    "description": "scattered clouds",
                                    "icon": "03n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700456400,
                            "temp": 9.01,
                            "feels_like": 6.44,
                            "pressure": 1009,
                            "humidity": 78,
                            "dew_point": 5.27,
                            "uvi": 0,
                            "clouds": 32,
                            "visibility": 10000,
                            "wind_speed": 4.77,
                            "wind_deg": 232,
                            "wind_gust": 11.06,
                            "weather": [
                                {
                                    "id": 802,
                                    "main": "Clouds",
                                    "description": "scattered clouds",
                                    "icon": "03n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700460000,
                            "temp": 9.02,
                            "feels_like": 6.75,
                            "pressure": 1008,
                            "humidity": 77,
                            "dew_point": 5.19,
                            "uvi": 0,
                            "clouds": 44,
                            "visibility": 10000,
                            "wind_speed": 4.11,
                            "wind_deg": 229,
                            "wind_gust": 10.65,
                            "weather": [
                                {
                                    "id": 802,
                                    "main": "Clouds",
                                    "description": "scattered clouds",
                                    "icon": "03n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700463600,
                            "temp": 8.49,
                            "feels_like": 7.15,
                            "pressure": 1007,
                            "humidity": 89,
                            "dew_point": 6.77,
                            "uvi": 0,
                            "clouds": 98,
                            "visibility": 7551,
                            "wind_speed": 2.35,
                            "wind_deg": 203,
                            "wind_gust": 7.74,
                            "weather": [
                                {
                                    "id": 501,
                                    "main": "Rain",
                                    "description": "moderate rain",
                                    "icon": "10n"
                                }
                            ],
                            "pop": 1,
                            "rain": {
                                "1h": 1.34
                            }
                        },
                        {
                            "dt": 1700467200,
                            "temp": 8.93,
                            "feels_like": 7.44,
                            "pressure": 1007,
                            "humidity": 91,
                            "dew_point": 7.39,
                            "uvi": 0,
                            "clouds": 99,
                            "visibility": 10000,
                            "wind_speed": 2.67,
                            "wind_deg": 165,
                            "wind_gust": 8.38,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10d"
                                }
                            ],
                            "pop": 1,
                            "rain": {
                                "1h": 0.78
                            }
                        },
                        {
                            "dt": 1700470800,
                            "temp": 9.71,
                            "feels_like": 9.25,
                            "pressure": 1006,
                            "humidity": 90,
                            "dew_point": 8.08,
                            "uvi": 0.04,
                            "clouds": 99,
                            "visibility": 10000,
                            "wind_speed": 1.57,
                            "wind_deg": 159,
                            "wind_gust": 4.6,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0.8
                        },
                        {
                            "dt": 1700474400,
                            "temp": 10.52,
                            "feels_like": 9.9,
                            "pressure": 1006,
                            "humidity": 87,
                            "dew_point": 8.35,
                            "uvi": 0.29,
                            "clouds": 96,
                            "visibility": 10000,
                            "wind_speed": 0.99,
                            "wind_deg": 357,
                            "wind_gust": 2.04,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10d"
                                }
                            ],
                            "pop": 1,
                            "rain": {
                                "1h": 0.13
                            }
                        },
                        {
                            "dt": 1700478000,
                            "temp": 9.95,
                            "feels_like": 8.39,
                            "pressure": 1007,
                            "humidity": 88,
                            "dew_point": 8.01,
                            "uvi": 0.19,
                            "clouds": 97,
                            "visibility": 10000,
                            "wind_speed": 3.1,
                            "wind_deg": 16,
                            "wind_gust": 4.3,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10d"
                                }
                            ],
                            "pop": 1,
                            "rain": {
                                "1h": 0.1
                            }
                        },
                        {
                            "dt": 1700481600,
                            "temp": 9.62,
                            "feels_like": 8.05,
                            "pressure": 1007,
                            "humidity": 84,
                            "dew_point": 7.01,
                            "uvi": 0.21,
                            "clouds": 97,
                            "visibility": 10000,
                            "wind_speed": 3.01,
                            "wind_deg": 5,
                            "wind_gust": 6.09,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0.8
                        },
                        {
                            "dt": 1700485200,
                            "temp": 10.12,
                            "feels_like": 9.25,
                            "pressure": 1008,
                            "humidity": 79,
                            "dew_point": 6.54,
                            "uvi": 0.35,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 2.93,
                            "wind_deg": 328,
                            "wind_gust": 7,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700488800,
                            "temp": 11.08,
                            "feels_like": 10.2,
                            "pressure": 1008,
                            "humidity": 75,
                            "dew_point": 6.83,
                            "uvi": 0.4,
                            "clouds": 54,
                            "visibility": 10000,
                            "wind_speed": 2.65,
                            "wind_deg": 314,
                            "wind_gust": 6.95,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700492400,
                            "temp": 10.88,
                            "feels_like": 10.09,
                            "pressure": 1008,
                            "humidity": 79,
                            "dew_point": 7.32,
                            "uvi": 0.16,
                            "clouds": 64,
                            "visibility": 10000,
                            "wind_speed": 2.91,
                            "wind_deg": 311,
                            "wind_gust": 7.44,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700496000,
                            "temp": 10.09,
                            "feels_like": 9.32,
                            "pressure": 1009,
                            "humidity": 83,
                            "dew_point": 7.28,
                            "uvi": 0,
                            "clouds": 48,
                            "visibility": 10000,
                            "wind_speed": 2.73,
                            "wind_deg": 302,
                            "wind_gust": 6.74,
                            "weather": [
                                {
                                    "id": 802,
                                    "main": "Clouds",
                                    "description": "scattered clouds",
                                    "icon": "03d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700499600,
                            "temp": 9.67,
                            "feels_like": 8.33,
                            "pressure": 1010,
                            "humidity": 86,
                            "dew_point": 7.29,
                            "uvi": 0,
                            "clouds": 45,
                            "visibility": 10000,
                            "wind_speed": 2.65,
                            "wind_deg": 290,
                            "wind_gust": 7.89,
                            "weather": [
                                {
                                    "id": 802,
                                    "main": "Clouds",
                                    "description": "scattered clouds",
                                    "icon": "03n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700503200,
                            "temp": 9.96,
                            "feels_like": 8.5,
                            "pressure": 1011,
                            "humidity": 84,
                            "dew_point": 7.36,
                            "uvi": 0,
                            "clouds": 53,
                            "visibility": 10000,
                            "wind_speed": 2.94,
                            "wind_deg": 291,
                            "wind_gust": 8.53,
                            "weather": [
                                {
                                    "id": 803,
                                    "main": "Clouds",
                                    "description": "broken clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700506800,
                            "temp": 10.01,
                            "feels_like": 9.31,
                            "pressure": 1011,
                            "humidity": 86,
                            "dew_point": 7.64,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 2.98,
                            "wind_deg": 295,
                            "wind_gust": 9.29,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700510400,
                            "temp": 10.27,
                            "feels_like": 9.68,
                            "pressure": 1012,
                            "humidity": 89,
                            "dew_point": 8.42,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.02,
                            "wind_deg": 303,
                            "wind_gust": 9.18,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700514000,
                            "temp": 10.64,
                            "feels_like": 10.06,
                            "pressure": 1012,
                            "humidity": 88,
                            "dew_point": 8.64,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.22,
                            "wind_deg": 318,
                            "wind_gust": 8.89,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700517600,
                            "temp": 10.65,
                            "feels_like": 10.04,
                            "pressure": 1013,
                            "humidity": 87,
                            "dew_point": 8.56,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.23,
                            "wind_deg": 324,
                            "wind_gust": 8.37,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700521200,
                            "temp": 10.49,
                            "feels_like": 9.94,
                            "pressure": 1013,
                            "humidity": 90,
                            "dew_point": 8.86,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 2.7,
                            "wind_deg": 326,
                            "wind_gust": 7.22,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700524800,
                            "temp": 10.39,
                            "feels_like": 9.86,
                            "pressure": 1014,
                            "humidity": 91,
                            "dew_point": 8.9,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 2.74,
                            "wind_deg": 327,
                            "wind_gust": 7.56,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700528400,
                            "temp": 10.33,
                            "feels_like": 9.79,
                            "pressure": 1014,
                            "humidity": 91,
                            "dew_point": 8.79,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.14,
                            "wind_deg": 337,
                            "wind_gust": 8.65,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700532000,
                            "temp": 10.3,
                            "feels_like": 9.79,
                            "pressure": 1015,
                            "humidity": 92,
                            "dew_point": 8.98,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.81,
                            "wind_deg": 349,
                            "wind_gust": 9.94,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10n"
                                }
                            ],
                            "pop": 0.74,
                            "rain": {
                                "1h": 0.19
                            }
                        },
                        {
                            "dt": 1700535600,
                            "temp": 10.51,
                            "feels_like": 9.91,
                            "pressure": 1016,
                            "humidity": 88,
                            "dew_point": 8.55,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 4.32,
                            "wind_deg": 358,
                            "wind_gust": 9.59,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0.22
                        },
                        {
                            "dt": 1700539200,
                            "temp": 10.04,
                            "feels_like": 9.32,
                            "pressure": 1017,
                            "humidity": 85,
                            "dew_point": 7.51,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 4.37,
                            "wind_deg": 1,
                            "wind_gust": 10.52,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700542800,
                            "temp": 9.54,
                            "feels_like": 7.08,
                            "pressure": 1018,
                            "humidity": 82,
                            "dew_point": 6.55,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 4.83,
                            "wind_deg": 0,
                            "wind_gust": 9.63,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700546400,
                            "temp": 9.44,
                            "feels_like": 6.83,
                            "pressure": 1019,
                            "humidity": 77,
                            "dew_point": 5.58,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 5.15,
                            "wind_deg": 358,
                            "wind_gust": 9.45,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700550000,
                            "temp": 9.74,
                            "feels_like": 7.64,
                            "pressure": 1019,
                            "humidity": 77,
                            "dew_point": 5.76,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 4.1,
                            "wind_deg": 347,
                            "wind_gust": 8.43,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700553600,
                            "temp": 9.38,
                            "feels_like": 7.14,
                            "pressure": 1021,
                            "humidity": 81,
                            "dew_point": 6.19,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 4.22,
                            "wind_deg": 338,
                            "wind_gust": 8.97,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700557200,
                            "temp": 9.18,
                            "feels_like": 7.04,
                            "pressure": 1022,
                            "humidity": 82,
                            "dew_point": 6.23,
                            "uvi": 0.09,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.91,
                            "wind_deg": 337,
                            "wind_gust": 8.96,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700560800,
                            "temp": 9.34,
                            "feels_like": 7.11,
                            "pressure": 1023,
                            "humidity": 83,
                            "dew_point": 6.49,
                            "uvi": 0.17,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 4.18,
                            "wind_deg": 334,
                            "wind_gust": 9,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700564400,
                            "temp": 9.44,
                            "feels_like": 7.45,
                            "pressure": 1023,
                            "humidity": 84,
                            "dew_point": 6.84,
                            "uvi": 0.16,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.71,
                            "wind_deg": 346,
                            "wind_gust": 8.82,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700568000,
                            "temp": 9.56,
                            "feels_like": 7.58,
                            "pressure": 1024,
                            "humidity": 86,
                            "dew_point": 7.22,
                            "uvi": 0.21,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.75,
                            "wind_deg": 350,
                            "wind_gust": 8.53,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700571600,
                            "temp": 9.68,
                            "feels_like": 7.82,
                            "pressure": 1024,
                            "humidity": 87,
                            "dew_point": 7.61,
                            "uvi": 0.2,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.57,
                            "wind_deg": 349,
                            "wind_gust": 7.92,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700575200,
                            "temp": 9.89,
                            "feels_like": 8.22,
                            "pressure": 1024,
                            "humidity": 88,
                            "dew_point": 7.92,
                            "uvi": 0.15,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.28,
                            "wind_deg": 358,
                            "wind_gust": 7.51,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700578800,
                            "temp": 10.26,
                            "feels_like": 9.61,
                            "pressure": 1025,
                            "humidity": 87,
                            "dew_point": 8.14,
                            "uvi": 0.1,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.08,
                            "wind_deg": 7,
                            "wind_gust": 7.89,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700582400,
                            "temp": 10.52,
                            "feels_like": 9.74,
                            "pressure": 1026,
                            "humidity": 81,
                            "dew_point": 7.37,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.39,
                            "wind_deg": 30,
                            "wind_gust": 7.98,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700586000,
                            "temp": 9.65,
                            "feels_like": 7.99,
                            "pressure": 1026,
                            "humidity": 79,
                            "dew_point": 6.04,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 3.17,
                            "wind_deg": 38,
                            "wind_gust": 8.08,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700589600,
                            "temp": 9.35,
                            "feels_like": 7.76,
                            "pressure": 1028,
                            "humidity": 77,
                            "dew_point": 5.48,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 2.95,
                            "wind_deg": 36,
                            "wind_gust": 7.89,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700593200,
                            "temp": 9.05,
                            "feels_like": 7.64,
                            "pressure": 1028,
                            "humidity": 76,
                            "dew_point": 5.02,
                            "uvi": 0,
                            "clouds": 100,
                            "visibility": 10000,
                            "wind_speed": 2.59,
                            "wind_deg": 33,
                            "wind_gust": 7.52,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700596800,
                            "temp": 8.48,
                            "feels_like": 7.46,
                            "pressure": 1029,
                            "humidity": 79,
                            "dew_point": 5.03,
                            "uvi": 0,
                            "clouds": 98,
                            "visibility": 10000,
                            "wind_speed": 1.96,
                            "wind_deg": 17,
                            "wind_gust": 6.13,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        },
                        {
                            "dt": 1700600400,
                            "temp": 7.97,
                            "feels_like": 6.96,
                            "pressure": 1029,
                            "humidity": 84,
                            "dew_point": 5.28,
                            "uvi": 0,
                            "clouds": 90,
                            "visibility": 10000,
                            "wind_speed": 1.86,
                            "wind_deg": 10,
                            "wind_gust": 5.59,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04n"
                                }
                            ],
                            "pop": 0
                        }
                    ],
                    "daily": [
                        {
                            "dt": 1700391600,
                            "sunrise": 1700378681,
                            "sunset": 1700410031,
                            "moonrise": 1700400000,
                            "moonset": 1700431080,
                            "moon_phase": 0.22,
                            "summary": "Expect a day of partly cloudy with rain",
                            "temp": {
                                "day": 11.99,
                                "min": 11.25,
                                "max": 12.88,
                                "night": 11.48,
                                "eve": 12.88,
                                "morn": 11.41
                            },
                            "feels_like": {
                                "day": 11.12,
                                "night": 10.85,
                                "eve": 12.23,
                                "morn": 10.67
                            },
                            "pressure": 1008,
                            "humidity": 72,
                            "dew_point": 7.14,
                            "wind_speed": 7.57,
                            "wind_deg": 262,
                            "wind_gust": 16.01,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10d"
                                }
                            ],
                            "clouds": 100,
                            "pop": 0.2,
                            "rain": 0.1,
                            "uvi": 0.4
                        },
                        {
                            "dt": 1700478000,
                            "sunrise": 1700465181,
                            "sunset": 1700496359,
                            "moonrise": 1700487540,
                            "moonset": 1700522760,
                            "moon_phase": 0.25,
                            "summary": "Expect a day of partly cloudy with rain",
                            "temp": {
                                "day": 9.95,
                                "min": 8.49,
                                "max": 11.53,
                                "night": 10.49,
                                "eve": 9.67,
                                "morn": 9.01
                            },
                            "feels_like": {
                                "day": 8.39,
                                "night": 9.94,
                                "eve": 8.33,
                                "morn": 6.44
                            },
                            "pressure": 1007,
                            "humidity": 88,
                            "dew_point": 8.01,
                            "wind_speed": 6.65,
                            "wind_deg": 261,
                            "wind_gust": 12.47,
                            "weather": [
                                {
                                    "id": 501,
                                    "main": "Rain",
                                    "description": "moderate rain",
                                    "icon": "10d"
                                }
                            ],
                            "clouds": 97,
                            "pop": 1,
                            "rain": 2.35,
                            "uvi": 0.4
                        },
                        {
                            "dt": 1700564400,
                            "sunrise": 1700551680,
                            "sunset": 1700582689,
                            "moonrise": 1700574840,
                            "moonset": 0,
                            "moon_phase": 0.29,
                            "summary": "Expect a day of partly cloudy with rain",
                            "temp": {
                                "day": 9.44,
                                "min": 7.56,
                                "max": 10.52,
                                "night": 7.56,
                                "eve": 9.65,
                                "morn": 9.54
                            },
                            "feels_like": {
                                "day": 7.45,
                                "night": 6.51,
                                "eve": 7.99,
                                "morn": 7.08
                            },
                            "pressure": 1023,
                            "humidity": 84,
                            "dew_point": 6.84,
                            "wind_speed": 5.15,
                            "wind_deg": 358,
                            "wind_gust": 10.52,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10d"
                                }
                            ],
                            "clouds": 100,
                            "pop": 0.74,
                            "rain": 0.19,
                            "uvi": 0.21
                        },
                        {
                            "dt": 1700650800,
                            "sunrise": 1700638179,
                            "sunset": 1700669022,
                            "moonrise": 1700662020,
                            "moonset": 1700614320,
                            "moon_phase": 0.32,
                            "summary": "There will be partly cloudy today",
                            "temp": {
                                "day": 9.25,
                                "min": 7.25,
                                "max": 10.73,
                                "night": 8.28,
                                "eve": 9.45,
                                "morn": 7.46
                            },
                            "feels_like": {
                                "day": 7.75,
                                "night": 6.29,
                                "eve": 7.61,
                                "morn": 7.46
                            },
                            "pressure": 1030,
                            "humidity": 80,
                            "dew_point": 5.97,
                            "wind_speed": 3.61,
                            "wind_deg": 256,
                            "wind_gust": 10.45,
                            "weather": [
                                {
                                    "id": 804,
                                    "main": "Clouds",
                                    "description": "overcast clouds",
                                    "icon": "04d"
                                }
                            ],
                            "clouds": 100,
                            "pop": 0,
                            "uvi": 0.75
                        },
                        {
                            "dt": 1700737200,
                            "sunrise": 1700724676,
                            "sunset": 1700755358,
                            "moonrise": 1700749200,
                            "moonset": 1700705820,
                            "moon_phase": 0.36,
                            "summary": "Expect a day of partly cloudy with clear spells",
                            "temp": {
                                "day": 12.72,
                                "min": 8.21,
                                "max": 12.72,
                                "night": 11.94,
                                "eve": 11.99,
                                "morn": 9.26
                            },
                            "feels_like": {
                                "day": 12.08,
                                "night": 11.15,
                                "eve": 11.23,
                                "morn": 7.03
                            },
                            "pressure": 1024,
                            "humidity": 78,
                            "dew_point": 8.84,
                            "wind_speed": 5.49,
                            "wind_deg": 276,
                            "wind_gust": 13.22,
                            "weather": [
                                {
                                    "id": 800,
                                    "main": "Clear",
                                    "description": "clear sky",
                                    "icon": "01d"
                                }
                            ],
                            "clouds": 10,
                            "pop": 0,
                            "uvi": 0.86
                        },
                        {
                            "dt": 1700823600,
                            "sunrise": 1700811172,
                            "sunset": 1700841697,
                            "moonrise": 1700836380,
                            "moonset": 1700797320,
                            "moon_phase": 0.4,
                            "summary": "Expect a day of partly cloudy with rain",
                            "temp": {
                                "day": 8.15,
                                "min": 4.61,
                                "max": 11.12,
                                "night": 4.61,
                                "eve": 5.4,
                                "morn": 10.26
                            },
                            "feels_like": {
                                "day": 5.12,
                                "night": 1.39,
                                "eve": 2.34,
                                "morn": 9.17
                            },
                            "pressure": 1014,
                            "humidity": 70,
                            "dew_point": 2.88,
                            "wind_speed": 5.39,
                            "wind_deg": 326,
                            "wind_gust": 12.74,
                            "weather": [
                                {
                                    "id": 500,
                                    "main": "Rain",
                                    "description": "light rain",
                                    "icon": "10d"
                                }
                            ],
                            "clouds": 72,
                            "pop": 0.2,
                            "rain": 0.28,
                            "uvi": 0.64
                        },
                        {
                            "dt": 1700910000,
                            "sunrise": 1700897667,
                            "sunset": 1700928038,
                            "moonrise": 1700923680,
                            "moonset": 1700888820,
                            "moon_phase": 0.43,
                            "summary": "Expect a day of partly cloudy with clear spells",
                            "temp": {
                                "day": 5.48,
                                "min": 2.39,
                                "max": 5.66,
                                "night": 3.74,
                                "eve": 4.63,
                                "morn": 2.39
                            },
                            "feels_like": {
                                "day": 1.91,
                                "night": 1.56,
                                "eve": 1.5,
                                "morn": -0.97
                            },
                            "pressure": 1006,
                            "humidity": 68,
                            "dew_point": -0.09,
                            "wind_speed": 5.06,
                            "wind_deg": 283,
                            "wind_gust": 10.36,
                            "weather": [
                                {
                                    "id": 800,
                                    "main": "Clear",
                                    "description": "clear sky",
                                    "icon": "01d"
                                }
                            ],
                            "clouds": 9,
                            "pop": 0,
                            "uvi": 1
                        },
                        {
                            "dt": 1700996400,
                            "sunrise": 1700984160,
                            "sunset": 1701014381,
                            "moonrise": 1701011280,
                            "moonset": 1700980380,
                            "moon_phase": 0.47,
                            "summary": "You can expect partly cloudy in the morning, with clearing in the afternoon",
                            "temp": {
                                "day": 5.4,
                                "min": 2.84,
                                "max": 5.45,
                                "night": 2.84,
                                "eve": 3.8,
                                "morn": 4.49
                            },
                            "feels_like": {
                                "day": 3.04,
                                "night": 0.98,
                                "eve": 1.75,
                                "morn": 1.89
                            },
                            "pressure": 1008,
                            "humidity": 59,
                            "dew_point": -2.08,
                            "wind_speed": 3.57,
                            "wind_deg": 338,
                            "wind_gust": 7.64,
                            "weather": [
                                {
                                    "id": 802,
                                    "main": "Clouds",
                                    "description": "scattered clouds",
                                    "icon": "03d"
                                }
                            ],
                            "clouds": 29,
                            "pop": 0,
                            "uvi": 1
                        }
                    ]
                }
                """;
    }
}
