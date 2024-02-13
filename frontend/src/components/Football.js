import { useEffect, useState } from 'react'

export function Football(){
    function loadfootball(){
        fetch("http://localhost:8080/football/leagues")
            .then((response)=> response.json())
            .then((data) => setFootball(data));
    }

    const [football, setFootball] = useState([]);

    useEffect(() => {
        loadfootball()
    }, [])
    return <p className="text-3xl font-bold underline">{JSON.stringify(football["count"])}</p>
}

