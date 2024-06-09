require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: *start
        q!: * (привет/здравствуй*/~добрый (~утро/~вечер/~дент/~ночь))
        a: Начнём.
        
    state: Weather
        q!: * ~погода
        a: С погодой лучше не загадывать
        
    state: Currency
        q!: * (~валюта/~курс)
        a: Лучше вам не знать...
        
    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}
