import { useEffect, useState } from 'react';

export function Football() {
    function loadFootball() {
        fetch("http://localhost:8080/football/leagues")
            .then((response) => response.json())
            .then((data) => setFootball(data));
    }

    const [football, setFootball] = useState([]);

    useEffect(() => {
        loadFootball();
    }, []);

    console.log(football)
    return "footbal";
}

export default Football;
