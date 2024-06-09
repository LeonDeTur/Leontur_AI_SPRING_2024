require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: *start
        q!: * (привет/здравствуй*/~добрый (~утро/~вечер/~дент/~ночь))
        a: Начнём.
        
    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}
