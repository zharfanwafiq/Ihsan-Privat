package com.zharfan.ihsanprivat.data

object MenuDataList {

    private val menuNames = arrayOf(
        "Private",
        "Regular",
        "Online",
        "Labs",
        "Jelajah",
        "Tutor",
        "Pustaka",
        "Jadwal",
        "Koleksi"
    )

   private val menuIcons = arrayOf(
       "https://s3-alpha-sig.figma.com/img/729d/c21c/b24f382470bddadc1c91cc942c5ad201?Expires=1648425600&Signature=CxoIyq8dgMgsulxUlpcpEXj56j7TImSYRXd3qKjyH7eKsdEeeAENBBBfY0X1R3lFO1Yfe34jcfWrpxq~u-l8-4oVNJiwLbCPpqnY0HvLeC0o2svvtUZT3k0PKxvQRpkQgtRGOKMFVqbWYVtsg2w6KGLt-8ShzzjHclkV5vIlQkNTkcI5217y1OeBfifdGbawUuxWChIgZOQWHd~5qnNs6uzjOOPM0VyOWF958v~Q8qyV0eW4imeo4Avup7FbrMo76bNzKunpitC0jDjF52-HAYR0dZwp7GtF8kWX8Yj3g-ukvRbDhpHgkKZlJEYNtGcrjAQYurVXBxiHy63n1hl62g__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/3d46/c780/1ce8dbd37ec802fe05cdb3771e2384c8?Expires=1648425600&Signature=IYin9vAP2WE~4NobAS54lWUB5s~oHsDTe2m0fvNlesbCRCz98-0zRDm5gB3M33tpXM4twIOfeyw2A1yHjZSMNQvQOVNy53~oYk3cNIUUVYkiRTQ1gIjXZ8FAJY6P6yz9x3ZiBBCExZuG7yAu4RhDDj0oTEzMsoOFzd03SZ4qoQ4HgvEcY0j02iuP9WTXSxc17R~lsgya6yXg-iMG1UxWNovl2UsWEUGM9ELpokUXCJew1YxzB-BS7eI4D0COB08wctC8nus~dePGf9tsXt06SuuZqUnv4sVA4D-oh0vY0IESMxtgSC0i3h8JRAfj7Ve7k97eJZATKqB3ne1H-G9UBw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/399f/6992/0fb6a2918e3b364514bb0112a0577bc1?Expires=1648425600&Signature=LIKu~Jz-AWIGBgmQY9rZJdx5lQEnvHiqLYmp4-pTocMJ3H4Shej55re3vL72SmiTrbrGwdY2fL0nlm7~RGS3qCRd9GVsjKbTnumR8kC59JNcbeiNFDY9gYBb4zsFAPEyOWEFaxk8~P1Fqlfr8OTr1L7codYnd09B~g0XUYFy6yMngfeK9j0FmoMXn65UN8s1DJpRcvr7ZBgJRTgMkjK7Wb0l8FKFmBpOlCYzIez3rK6ZQcjJBJxQ~EhdnzihGuUobSc4XqiCOuTA8Ai79q4nQS8xf7366hri6zR7rT0s9lT8OaBJhFKAelmj6Lo9AZW6bGCgYsYHUAgJAPYsn0SnIQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/777d/1fa3/f5ae5730903074f535346ae619045efa?Expires=1648425600&Signature=g1Akv1QC1KBL~aQ6ZtoOGXx8U~pXTtDe7ZP4r1JbuJUhH1mkUpoKf7K6KTYZxWC5ZNAJ~WdrJ42yJRaWU1x3XdukQiAHg6xlAikeAwgZiZhZw03A6JMB2bnDNZAUNO8~-wm9zP05YGLC6-EV5Lq5izfweEY696xrGHS~LxD~zcq4mmKV7WONbhkBTRaB~mE7mj9-Z6uO~aihaqeXZxkWQ3o2PExjZvwg~jQVINhBtVc1vLcb252E7Rd0ffrAFU9a7JL7sncw92~7t6cl7zJXrUHASEb2D7ZzoXSgz2~4qx~i7Ludpw6sdimcGH31VdfcGYbsz3O4x8NX3JAVKVQiuQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/8511/185c/0057f4bc26998f5c97b6c1cb1ae1e9fe?Expires=1648425600&Signature=T37KhN9nBtqbLUXehsjPzjoZZks0muePe7AZYGeLeSQ134fMtNyZor~U-SZfgXtNea5ABMW4YPV9Z6BKDX-wU2Vq91xTckE7wnpRocQxthpgRfeOV5xsVyXhvdAcaEr~72jStXqT0gye902WPK-vpWf75saurUwcMT5o1dA-KHVuq~LWgxOHmhJnJJ7jux3pGSkfNDzXaIpwUoREJatXrBuQUrBBDkCXGPyaE1tWt5Uk7le~UFAfoqInSmwo3C1pqj8n6a7sa-wyuQ9XZm3MY4rDxzgZ9j0kYF3wo~hFRFOks~wHQFePFlBFHjop8vi93cQJ0yRTZHkFlr5zaczQlA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/3b77/8c1d/ffddaff6ad2173a149edf3742512d6d4?Expires=1648425600&Signature=Y5DHCt7B1ZmDTG4XkjeHvouibQsFzVURh1XWIp4vtTl20Phsj~OCtXZJrEJzVk6RcEgRvEEgk~Hc7aV2w7T7a~HOI0q6t4GAwBR77WmGgS9gJCz2Kj7LXAkiX5plBF9t35A1ZqbM6yK2HF~TIK5xAuGi-bh33IDhs3AFQDuEKNsWJ2DFG6lcD2neSbU-EDG2fq624tDVhHC8Rr6MzgAb3N-sB4X0sBn30ezRiZ-9I4Zm2vAvubEODZXMjp1aytE-LJZ7InnFB0tQw-1Kn93HQWcfOIzD9kw88eBwMrtngq8xPixEFV1qtGG5~1GYqT5l1Nx0iQJlkTRbMLtG9boEiQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/6836/8d63/5e9b99d760336cd97dc618cca42d337c?Expires=1648425600&Signature=RLo2~~cH1lwAvj5TnSTaVrU7qqRFlIQ8D1IUM0Dpf396tqQHI8cMNyjb8LnkA4BQW4-gw3JhU98HFLYK59Tve46BeAyMu7LgkIGz59oxFq6VnDRDJo56SNX~B3n9xSqQNHWeKP~8iL9R2x0d6cC6M9zKdROZHwcDx04cdYx81pvz6~EsSsfvncb89IqyytJoVY7hGUHX0MZWlNZceXWK84t-uCqeF4pF6GxzkLutV6dbaLO6RFa~hd8Qg83Fryv-ftMAKDA1arcycP6QSkrK9tpam~hKDxmj-meOKz5Gr2f1UBsVFdCWIUxE1P-ld2YC0U6LN~~XHYflQL1yd2MmMw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/223a/da58/2ad08d6933b7a75c2fdd8b220ed6a2d6?Expires=1648425600&Signature=PKzjAbCdeR3cLBKRu5dRFU4ZqlpUPuYYa2AlOd69hahL9cVTpvbR4n0zVTNzSZiS~hA1fv0Emh3lq78~sTftVKDqcZvQeIC-3Dj2PBqCK0tiuXJiZd7h80GXzv5y5zV46RSSy3-2Yxy0tKts9vrNagXF7hwW--KKlfqR9Zb6M1MPXWjMhE-s5bKO57olk3~9Ts2bROexs-n~5Q6wJQ3NkjglPCguOXx7uEKWOAzCasYf1Ukg50P0HieZDvwTSnYQROEJMQ6Wh-vDrizJdHNmBJCIlBDnOIyycaFAb9l~iVXvIIBkQN5dYraYCgyD~P6sFuej-KxahAkWG5h35uzzAQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
       "https://s3-alpha-sig.figma.com/img/0a36/ca8d/8e752b096531bfe5585aa4d2fc691561?Expires=1648425600&Signature=SO7pxFENvdmHToEn0912VZ93rROtVfBa7deiMXaxpv9kuMCNBy41SEeLy3~3kgiOHLOkNhK9SKLEPbKaPLHbINVA8-cOaqHHGmontbUCfsvBZV4Csg1pokYMVG5NP80tZxd6uigztMPSMUqjaD25jqDPO~fV7VSHITD~9iPdY3TeoJZt84SClHwd8L1QO3McgSDbLrsnr0UPGHFwBTIpXqjkkva1OGRgQcc-2FdzfRPZQ9ryAb8ufpwdue6BZ4ye-EkqmPa9AEiSc93819vtt5ihu3Nu5tuWP7LuSHzWwfgrQF~O9lRQj9nAYFT-lXhP4xATMzjMPJCpF2hcA62XNg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA"
   )

    val listData : ArrayList<IhsanPrivatMenuHome>
        get() {
            val list = arrayListOf<IhsanPrivatMenuHome>()
            for (position in menuNames.indices){
                val menus = IhsanPrivatMenuHome()
                menus.menuNames = menuNames[position]
                menus.menuIcons = menuIcons[position]
                list.add(menus)

            }
            return list
        }
}